public void deleteHobby(int id) {
    javax.persistence.EntityManager em = getEntityManager();
    try {
        em.getTransaction().begin();
        em.remove(getHobby(id));
        em.getTransaction().commit();
    } finally {
        em.close();
    }
}