@java.lang.Override
public java.util.List<org.molgenis.data.mapping.model.EntityMapping> toEntityMappings(java.util.List<org.molgenis.data.Entity> entityMappingEntities) {
    return com.google.common.collect.Lists.transform(entityMappingEntities, this::toEntityMapping);
}