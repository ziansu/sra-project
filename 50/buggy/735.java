@java.lang.Override
protected void migrate(com.constellio.model.services.schemas.builders.MetadataSchemaTypesBuilder typesBuilder) {
    typesBuilder.getDefaultSchema(Folder.SCHEMA_TYPE).get(Folder.COPY_STATUS_ENTERED).setDefaultValue(CopyType.PRINCIPAL);
    typesBuilder.getDefaultSchema(Category.SCHEMA_TYPE).create(Category.DEACTIVATE).setType(MetadataValueType.BOOLEAN).setDefaultValue(null);
}