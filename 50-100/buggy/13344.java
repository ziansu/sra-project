public void deleteCompany(int cvr) {
    javax.persistence.EntityManager em = getEntityManager();
    try {
        em.getTransaction().begin();
        em.remove(getCompany(cvr));
        em.getTransaction().commit();
    } finally {
        em.close();
    }
}