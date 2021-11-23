public java.lang.String save(java.lang.Object entity) {
    javax.persistence.EntityManager em = null;
    try {
        em = begin();
        em.persist(entity);
        em.getTransaction().commit();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return "Failure: " + (e.getMessage());
    } finally {
        if (em != null)
            em.close();
        
    }
    return "Success";
}