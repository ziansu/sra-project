@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.List<com.health.entity.Hospital> findEmergencyBySuburb(java.lang.String suburb) {
    try {
        java.lang.String str = "SELECT h FROM Hospital h WHERE h.suburb = ?1 AND h.isemergency = ?2";
        javax.persistence.Query query = em.createQuery(str);
        query.setParameter(1, suburb);
        query.setParameter(2, "YES");
        return query.getResultList();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        em.close();
        return null;
    }
}