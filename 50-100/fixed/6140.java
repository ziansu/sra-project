public dataAcces.entity.User searchByUsername(java.lang.String username) {
    javax.persistence.EntityManager em = emf.createEntityManager();
    dataAcces.entity.User user = null;
    try {
        user = em.find(dataAcces.entity.User.class, username);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        java.lang.System.out.println(e);
    } finally {
        em.close();
    }
    return user;
}