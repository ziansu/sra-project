public void deleteCompany(int id) {
    javax.persistence.EntityManager em = getEntityManager();
    try {
        em.getTransaction().begin();
        em.remove(getCompany(id));
        em.getTransaction().commit();
    } finally {
        em.close();
    }
}