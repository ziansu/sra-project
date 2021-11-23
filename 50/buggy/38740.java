void onError(java.lang.Exception exception) {
    if ((handler) == null) {
        handleError(exception);
    }else {
        final android.os.Message message = handler.obtainMessage(FileDownloadStatus.error, exception);
        handler.sendMessage(message);
    }
}