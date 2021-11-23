@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.List<com.health.entity.GP> findBySuburb(java.lang.String suburb) {
    try {
        java.lang.String str = "SELECT g FROM GP g WHERE g.suburb = ?1";
        javax.persistence.Query query = em.createQuery(str);
        query.setParameter(1, suburb);
        return query.getResultList();
    } catch (java.lang.Exception e) {
        em.close();
        e.printStackTrace();
        return null;
    }
}