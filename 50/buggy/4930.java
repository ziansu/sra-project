protected void close() {
    if (((remoteRequestExecutor) != null) && (!(remoteRequestExecutor.isShutdown()))) {
        com.couchbase.lite.util.Utils.shutdownAndAwaitTermination(remoteRequestExecutor, Replication.DEFAULT_MAX_TIMEOUT_FOR_SHUTDOWN);
    }
}