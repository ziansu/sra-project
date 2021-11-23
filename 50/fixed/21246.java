protected boolean isInSyncInterval(long syncInterval, long lastSync) {
    if (lastSync == 0)
        return false;
    
    long timeNow = java.lang.System.currentTimeMillis();
    return (timeNow - lastSync) < syncInterval;
}