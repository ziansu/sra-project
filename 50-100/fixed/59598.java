private void onRetry(java.lang.Throwable ex, final int retryTimes, final long soFarBytes) {
    if (com.liulishuo.filedownloader.util.FileDownloadLog.NEED_LOG) {
        com.liulishuo.filedownloader.util.FileDownloadLog.d(this, "On retry %d %s %d %d", getId(), ex, retryTimes, autoRetryTimes);
    }
    ex = exFiltrate(ex);
    helper.updateRetry(getId(), ex.getMessage(), retryTimes);
    transferModel.setThrowable(ex);
    transferModel.setRetryingTimes(retryTimes);
    onStatusChanged(model.getStatus());
}