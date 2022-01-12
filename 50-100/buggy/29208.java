@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.List<com.health.entity.GP> findBySuburbAndLanguage(java.lang.String suburb, java.lang.String language) {
    try {
        java.lang.String str = "SELECT g FROM GP g WHERE g.suburb = ?1 AND g.language = ?2";
        javax.persistence.Query query = em.createQuery(str);
        query.setParameter(1, suburb);
        query.setParameter(2, language);
        return query.getResultList();
    } catch (java.lang.Exception e) {
        em.close();
        e.printStackTrace();
        return null;
    }
}