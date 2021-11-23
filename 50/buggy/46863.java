public void attemptSend() {
    if ((enableRESTUpload) || (enableMongoUpload)) {
        syncToMogoDb();
    }
    setRetryTimer();
}