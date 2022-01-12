@java.lang.Override
public org.finra.herd.model.jpa.TagTypeEntity getTagTypeByDisplayName(java.lang.String displayName) {
    javax.persistence.criteria.CriteriaBuilder builder = entityManager.getCriteriaBuilder();
    javax.persistence.criteria.CriteriaQuery<org.finra.herd.model.jpa.TagTypeEntity> criteria = builder.createQuery(org.finra.herd.model.jpa.TagTypeEntity.class);
    javax.persistence.criteria.Root<org.finra.herd.model.jpa.TagTypeEntity> tagTypeEntity = criteria.from(org.finra.herd.model.jpa.TagTypeEntity.class);
    javax.persistence.criteria.Predicate queryRestriction = builder.equal(builder.upper(tagTypeEntity.get(TagTypeEntity_.displayName)), displayName.toUpperCase());
    criteria.select(tagTypeEntity).where(queryRestriction);
    return executeSingleResultQuery(criteria, java.lang.String.format("Found more than one tag type with displayName=\"%s\".", displayName));
}