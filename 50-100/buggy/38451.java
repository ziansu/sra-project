@java.lang.Override
public void runTask() {
    org.atlasapi.remotesite.pa.PaSingleDateUpdater.LOG.info("Beginning ingest of PA files for {}", dateString);
    final java.lang.String filenameContains = (dateString) + "_tvdata";
    processFiles(fileManager.localTvDataFiles(new com.google.common.base.Predicate<java.io.File>() {
        @java.lang.Override
        public boolean apply(java.io.File input) {
            return input.getName().contains(filenameContains);
        }
    }));
    org.atlasapi.remotesite.pa.PaSingleDateUpdater.LOG.info("Finished ingest of PA files for {}", dateString);
}