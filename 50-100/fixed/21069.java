private void disconnectFromHub() {
    if (((heartBeatJob) != null) && (!(heartBeatJob.isDone()))) {
        heartBeatJob.cancel(false);
    }
    if ((client) != null) {
        client.removeListener(this);
        client.disconnect();
    }
}