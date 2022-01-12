public boolean submitPropsedSubject(java.lang.String title, java.lang.String teacher, java.lang.String description, java.lang.String proposer) {
    entities.ProposalSubject prosub = new entities.ProposalSubject(title, description, teacher, proposer);
    try {
        em.getTransaction().begin();
        em.persist(prosub);
        em.getTransaction().commit();
        em.close();
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}