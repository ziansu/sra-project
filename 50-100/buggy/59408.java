public java.lang.String save(java.lang.Object entity) {
    try {
        javax.persistence.EntityManager em = begin();
        em.persist(entity);
        em.getTransaction().commit();
        em.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return "Failure: " + (e.getMessage());
    }
    return "Success";
}