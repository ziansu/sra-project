public recruitment.business.ApplicantDTO registerApplicant(java.lang.String firstname, java.lang.String lastname, java.lang.String dateofbirth, java.lang.String email, java.lang.String username, java.lang.String password) {
    if ((em.find(recruitment.business.Applicant.class, username)) != null) {
        throw new javax.persistence.EntityExistsException(("Account already exists with username " + username));
    }else {
        recruitment.business.Applicant newApplicant = new recruitment.business.Applicant(firstname, lastname, dateofbirth, email, username, password);
        em.persist(newApplicant);
        return newApplicant;
    }
}