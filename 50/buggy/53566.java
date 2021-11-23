@java.lang.Override
public java.util.List<org.molgenis.data.mapping.model.EntityMapping> toEntityMappings(java.util.List<org.molgenis.data.Entity> entityMappingEntities) {
    return com.google.common.collect.Lists.transform(entityMappingEntities, new com.google.common.base.Function<org.molgenis.data.Entity, org.molgenis.data.mapping.model.EntityMapping>() {
        @java.lang.Override
        public org.molgenis.data.mapping.model.EntityMapping apply(org.molgenis.data.Entity entityMappingEntity) {
            return toEntityMapping(entityMappingEntity);
        }
    });
}