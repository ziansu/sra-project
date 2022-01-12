public void end() {
    javax.persistence.EntityManager em = entityManager.get();
    if (null == em) {
        return ;
    }
    try {
        em.close();
    } finally {
        entityManager.remove();
    }
}