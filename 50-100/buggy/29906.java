@java.lang.Override
protected void migrate(com.constellio.model.services.schemas.builders.MetadataSchemaTypesBuilder builder) {
    createNewRetentionRulesMetadatas();
    setupCategoryMetadatasCalculators();
    setupFoldersMetadatasCalculators();
    setupDocumentsMetadatasCalculators();
    alterContainerSchema();
    createNewDecommissioningListMetadata();
    for (com.constellio.model.services.schemas.builders.MetadataSchemaTypeBuilder typeBuilder : builder.getTypes()) {
        com.constellio.model.services.schemas.builders.MetadataSchemaBuilder schemaBuilder = typeBuilder.getDefaultSchema();
        if (schemaBuilder.hasMetadata("description")) {
            schemaBuilder.get("description").setEssentialInSummary(true);
        }
    }
}