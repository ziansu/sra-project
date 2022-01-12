@java.lang.Override
public void alter(com.constellio.model.services.schemas.builders.MetadataSchemaTypesBuilder types) {
    types.getSchema(StorageSpace.DEFAULT_SCHEMA).get(StorageSpace.AVAILABLE_SIZE).defineDataEntry().asCalculated(com.constellio.app.modules.rm.model.calculators.storageSpace.StorageSpaceAvailableSizeCalculator.class);
    types.getSchema(StorageSpace.DEFAULT_SCHEMA).get(StorageSpace.LINEAR_SIZE_SUM).defineDataEntry().asSum(types.getDefaultSchema(ContainerRecord.SCHEMA_TYPE).getMetadata(ContainerRecord.STORAGE_SPACE), types.getDefaultSchema(ContainerRecord.SCHEMA_TYPE).getMetadata(ContainerRecord.CAPACITY));
    types.getSchema(ContainerRecord.DEFAULT_SCHEMA).get(ContainerRecord.LOCALIZATION).defineDataEntry().asCalculated(com.constellio.app.modules.rm.model.calculators.container.ContainerRecordLocalizationCalculator.class);
}