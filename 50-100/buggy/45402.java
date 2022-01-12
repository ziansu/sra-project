public synchronized void start() {
    if (((id) == null) || (((finishedAt) == null) || (((java.lang.System.currentTimeMillis()) - (finishedAt)) > (sessionPendingMillis)))) {
        id = java.util.UUID.randomUUID().toString();
    }
    finishedAt = null;
}