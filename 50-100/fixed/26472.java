@java.lang.Override
public void handleError(org.forest.http.ForestRequest request, org.forest.http.ForestResponse response, java.lang.Exception ex) {
    org.forest.exceptions.ForestRuntimeException e = null;
    if (ex instanceof org.forest.exceptions.ForestRuntimeException) {
        e = ((org.forest.exceptions.ForestRuntimeException) (ex));
    }else {
        e = new org.forest.exceptions.ForestRuntimeException(ex);
    }
    request.getInterceptorChain().onError(e, request, response);
    if ((request.getOnError()) != null) {
        request.getOnError().onError(e, request, response);
    }else {
        throw e;
    }
}