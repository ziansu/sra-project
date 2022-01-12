public static org.lightadmin.core.web.support.ManageableEntity associatedPersistentEntity(java.lang.String stringRepresentation, boolean managedDomainType, java.lang.String primaryKey, java.lang.Object primaryKeyValue, org.springframework.hateoas.Link domainLink) {
    org.lightadmin.core.web.support.ManageableEntity entity = new org.lightadmin.core.web.support.ManageableEntity();
    entity.setDynamicProperties(null, stringRepresentation, domainLink, managedDomainType, primaryKey, primaryKeyValue);
    return entity;
}