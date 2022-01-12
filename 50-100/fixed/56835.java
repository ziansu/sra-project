private boolean checkTimestamp(long timestamp) {
    long current = (java.lang.System.currentTimeMillis()) + (timeRef);
    if (((current - timestamp) > (pt.ulisboa.ist.sirs.project.securesmarthome.SecurityManager.TIMESTAMP_THRESHOLD)) || (timestamp > current))
        return false;
    
    return true;
}