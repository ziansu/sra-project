private boolean checkTimestamp(long timestamp) {
    long current = (java.lang.System.currentTimeMillis()) + (timeRef);
    java.lang.System.out.println("Timestamp check: ");
    java.lang.System.out.println(("Received: " + timestamp));
    java.lang.System.out.println(("Current: " + current));
    if (((current - timestamp) > (pt.ulisboa.ist.sirs.project.securesmarthome.SecurityManager.TIMESTAMP_THRESHOLD)) || (timestamp > current))
        return false;
    
    return true;
}