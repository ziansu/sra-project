void execute(final java.util.List<org.sleuthkit.autopsy.ingest.IngestServiceAbstract> services, final java.util.List<org.sleuthkit.datamodel.Image> images) {
    org.sleuthkit.autopsy.ingest.IngestManager.logger.log(java.util.logging.Level.INFO, ("Will enqueue number of images: " + (images.size())));
    if (!(isIngestRunning())) {
        ui.clearMessages();
    }
    queueWorker = new org.sleuthkit.autopsy.ingest.IngestManager.EnqueueWorker(services, images);
    queueWorker.execute();
    ui.restoreMessages();
}