@java.lang.Override
protected void onError(java.lang.Exception e) {
    upstreamConsumer.closeWithError(e);
}