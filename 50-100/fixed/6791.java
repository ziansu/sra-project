private javax.persistence.TypedQuery<testJpa.simple.parentChild.domain.ParentTable> createDataQuery(final java.lang.String data) {
    final javax.persistence.criteria.CriteriaBuilder cb = em.getCriteriaBuilder();
    final javax.persistence.criteria.CriteriaQuery<testJpa.simple.parentChild.domain.ParentTable> cq = cb.createQuery(testJpa.simple.parentChild.domain.ParentTable.class);
    final javax.persistence.criteria.Root<testJpa.simple.parentChild.domain.ParentTable> root = cq.from(testJpa.simple.parentChild.domain.ParentTable.class);
    cq.where(cb.equal(root.get("data"), data));
    return em.createQuery(cq);
}