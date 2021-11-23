private void processResponse(javax.ws.rs.container.ContainerResponseContext responseContext) throws java.io.IOException {
    java.util.UUID key = getRequestId();
    org.mockenize.model.LogBean logBean = loggingService.getByKey(key);
    if (logBean != null) {
        responseContext.getHeaders().put(org.mockenize.provider.filter.ResponseLoggingFilter.KEY, com.google.common.collect.Lists.<java.lang.Object>newArrayList(key));
        logBean.setResponse(mapResponseLogBean(responseContext));
        loggingService.save(logBean);
        org.jboss.logging.MDC.remove(org.mockenize.provider.filter.ResponseLoggingFilter.KEY);
    }
}