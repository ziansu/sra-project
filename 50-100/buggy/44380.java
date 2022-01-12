private void handleException(final com.netflix.zuul.context.RequestContext context, final java.lang.Exception ex, final int statusCode, final java.lang.String message) {
    log.info(ex.getMessage(), ex);
    context.set("error.exception", ex);
    context.set("error.status_code", statusCode);
    context.set("error.message", message);
}