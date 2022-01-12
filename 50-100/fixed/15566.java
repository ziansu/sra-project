public org.hibernate.boot.internal.MetadataImpl buildMetadataInstance(org.hibernate.boot.spi.MetadataBuildingContext buildingContext) {
    processSecondPasses(buildingContext);
    processExportableProducers(buildingContext);
    try {
        return new org.hibernate.boot.internal.MetadataImpl(uuid, options, getBootstrapContext(), identifierGeneratorFactory, entityBindingMap, mappedSuperClasses, collectionBindingMap, filterDefinitionMap, fetchProfileMap, imports, idGeneratorDefinitionMap, namedQueryMap, namedNativeQueryMap, namedProcedureCallMap, sqlResultSetMappingMap, namedEntityGraphMap, sqlFunctionMap, getDatabase(), auditMetadataBuilder);
    } finally {
        getBootstrapContext().release();
    }
}