void onError(java.lang.Exception exception) {
    if ((handler) == null) {
        handleError(exception);
    }else {
        sendMessage(handler.obtainMessage(FileDownloadStatus.error, exception));
    }
}