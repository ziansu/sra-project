void onRetry(java.lang.Exception exception, int remainRetryTimes, long invalidIncreaseBytes) {
    synchronized(increaseLock) {
        this.callbackIncreaseBuffer = 0;
        model.setSoFar(((model.getSoFar()) - invalidIncreaseBytes));
    }
    if ((handler) == null) {
        handleRetry(exception, remainRetryTimes);
    }else {
        sendMessage(handler.obtainMessage(FileDownloadStatus.retry, remainRetryTimes, 0, exception));
    }
}