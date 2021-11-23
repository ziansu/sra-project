private void abortHandler(javax.servlet.http.HttpServletRequest request, java.lang.String origin, org.apache.wicket.request.component.IRequestablePage page) {
    onAborted(request, origin, page);
    org.apache.wicket.protocol.http.CsrfPreventionRequestCycleListener.log.info("Possible CSRF attack, request URL: {}, Origin: {}, action: aborted with error {} {}", new java.lang.Object[]{ request.getRequestURL() , origin , errorCode , errorMessage });
    throw new org.apache.wicket.request.http.flow.AbortWithHttpErrorCodeException(errorCode, errorMessage);
}