@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.List<com.health.entity.Hospital> findBySuburb(java.lang.String suburb) {
    try {
        java.lang.String str = "SELECT h FROM Hospital h WHERE h.suburb = :suburb";
        javax.persistence.Query query = em.createQuery(str);
        query.setParameter("suburb", suburb);
        return query.getResultList();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        em.close();
        return null;
    } finally {
        em.close();
    }
}