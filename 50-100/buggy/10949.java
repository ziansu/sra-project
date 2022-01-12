private java.lang.String stringRepresentation(java.lang.Object value, org.lightadmin.core.web.support.PersistentEntity persistentEntity) {
    org.lightadmin.core.config.domain.DomainTypeBasicConfiguration domainTypeBasicConfiguration = adminConfiguration.forDomainType(persistentEntity.getType());
    org.lightadmin.api.config.utils.EntityNameExtractor nameExtractor = domainTypeBasicConfiguration.getEntityConfiguration().getNameExtractor();
    return org.lightadmin.core.config.domain.configuration.support.ExceptionAwareTransformer.exceptionAwareNameExtractor(nameExtractor, domainTypeBasicConfiguration).apply(value);
}