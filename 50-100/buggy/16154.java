public java.lang.String getApplicantName() {
    if ((applicantName) == null) {
        applicantName = getUserManager().getUser(this.getReport().getApplicantId().toString()).getProfile().getFullName();
    }
    return applicantName;
}