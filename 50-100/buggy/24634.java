private void redeleteHangedFile() {
    int interval = this.getMessageStoreConfig().getRedeleteHangedFileInterval();
    long currentTimestamp = java.lang.System.currentTimeMillis();
    if ((currentTimestamp - (this.lastRedeleteTimestamp)) > interval) {
        this.lastRedeleteTimestamp = currentTimestamp;
        int destroyMapedFileIntervalForcibly = this.getMessageStoreConfig().getDestroyMapedFileIntervalForcibly();
        if (this.commitLog.retryDeleteFirstFile(destroyMapedFileIntervalForcibly)) {
        }
    }
}