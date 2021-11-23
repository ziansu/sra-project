private void setupExceptionHandling() {
    onException(org.apache.camel.http.common.HttpOperationFailedException.class).process(new processors.TimeoutExceptionHandler()).handled(true);
    onException(java.lang.Exception.class).process(new processors.ServerErrorHandler());
}