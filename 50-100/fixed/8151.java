void execute(final java.util.List<org.sleuthkit.autopsy.ingest.IngestServiceAbstract> services, final org.sleuthkit.datamodel.Image image) {
    java.util.List<org.sleuthkit.datamodel.Image> images = new java.util.ArrayList<org.sleuthkit.datamodel.Image>();
    images.add(image);
    org.sleuthkit.autopsy.ingest.IngestManager.logger.log(java.util.logging.Level.INFO, ("Will enqueue image: " + (image.getName())));
    execute(services, images);
}