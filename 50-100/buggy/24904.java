public void addAsyncRequest(final org.springframework.web.context.request.async.DeferredResult<java.util.List<com.studerw.appMsg.AppMsg>> deferredResult, java.lang.Integer startId) {
    this.waitingRequests.put(deferredResult, startId);
    deferredResult.onTimeout(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.studerw.appMsg.AppMsgHandler.LOG.info("Request timed out (returning empty list.");
            waitingRequests.remove(deferredResult);
            deferredResult.setResult(java.util.Collections.EMPTY_LIST);
        }
    });
}