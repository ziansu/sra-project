public void deleteHobby(java.lang.String name) {
    javax.persistence.EntityManager em = getEntityManager();
    try {
        em.getTransaction().begin();
        em.remove(getHobby(name));
        em.getTransaction().commit();
    } finally {
        em.close();
    }
}