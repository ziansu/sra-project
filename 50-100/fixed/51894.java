private void exportMetadata() {
    logger.info(Messages.i18n.format("StorageExporter.ExportingMetaData"));
    io.apiman.manager.api.exportimport.beans.MetadataBean metadata = new io.apiman.manager.api.exportimport.beans.MetadataBean();
    metadata.setApimanVersion(version.getVersionString());
    metadata.setExportedOn(new java.util.Date());
    writer.writeMetadata(metadata);
}