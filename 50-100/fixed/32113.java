private java.lang.Object onError(final java.lang.Throwable cause, final org.mariotaku.restfu.HttpRequest httpRequest, final org.mariotaku.restfu.HttpResponse response, final java.lang.Object[] args) throws java.lang.Exception {
    final java.lang.Exception exception = exceptionFactory.newException(cause, httpRequest, response);
    if (args != null) {
        for (java.lang.Object arg : args) {
            if (arg instanceof org.mariotaku.restfu.callback.ErrorCallback) {
                ((org.mariotaku.restfu.callback.ErrorCallback) (arg)).error(exception);
                return null;
            }
        }
    }
    throw exception;
}