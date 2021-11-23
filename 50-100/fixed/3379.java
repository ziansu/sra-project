@java.lang.SuppressWarnings(value = "unchecked")
@org.springframework.transaction.annotation.Transactional
@java.lang.Override
public java.util.List<com.health.entity.GP> findByPostcode(int postcode) {
    try {
        java.lang.String str = "SELECT g FROM GP g WHERE g.postcode BETWEEN ?1 AND ?2";
        javax.persistence.Query query = em.createQuery(str);
        query.setParameter(1, (postcode - 2));
        query.setParameter(2, (postcode + 2));
        return query.getResultList();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        em.close();
        return null;
    } finally {
        em.close();
    }
}