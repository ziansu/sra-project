@java.lang.Override
public void onException(java.lang.Exception e) {
    connectsMonitor.removePending(address);
    if (io.datakernel.http.AsyncHttpClient.logger.isWarnEnabled()) {
        io.datakernel.http.AsyncHttpClient.logger.warn("Connect error to {} : {}", address, e.getMessage());
    }
    if (e instanceof java.net.BindException) {
        blockBindException(address, e);
    }
    callback.onException(e);
}