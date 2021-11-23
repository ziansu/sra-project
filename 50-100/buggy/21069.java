private void disconnectFromHub() {
    if (((retryJob) != null) && (!(retryJob.isDone()))) {
        retryJob.cancel(true);
    }
    if (((heartBeatJob) != null) && (!(heartBeatJob.isDone()))) {
        heartBeatJob.cancel(true);
    }
    if ((client) != null) {
        client.removeListener(this);
        client.disconnect();
        client = null;
    }
}