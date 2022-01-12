private void syncFileDiff() {
    java.util.List<org.smartdata.model.FileDiff> pendingDiffs = null;
    try {
        pendingDiffs = metaStore.getPendingDiff();
        diffPreProcessing(pendingDiffs);
    } catch (org.smartdata.metastore.MetaStoreException e) {
        org.smartdata.hdfs.scheduler.CopyScheduler.LOG.error("Sync fileDiffs error", e);
    }
}