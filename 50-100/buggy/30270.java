public java.lang.Long findOrderIndexByKuntaApiIdentifier(java.lang.String kuntaApiIdentifier) {
    javax.persistence.EntityManager entityManager = getEntityManager();
    javax.persistence.criteria.CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
    javax.persistence.criteria.CriteriaQuery<java.lang.Long> criteria = criteriaBuilder.createQuery(java.lang.Long.class);
    javax.persistence.criteria.Root<fi.otavanopisto.kuntaapi.server.persistence.model.Identifier> root = criteria.from(fi.otavanopisto.kuntaapi.server.persistence.model.Identifier.class);
    criteria.select(root.get(Identifier_.orderIndex));
    criteria.where(criteriaBuilder.equal(root.get(Identifier_.kuntaApiId), kuntaApiIdentifier));
    return entityManager.createQuery(criteria).getSingleResult();
}