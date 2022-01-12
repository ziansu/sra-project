private void populateQueryParams(org.openstack4j.core.transport.HttpRequest<R> request) {
    if (!(request.hasQueryParams()))
        return ;
    
    for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.Object>> entry : request.getQueryParams().entrySet()) {
        for (java.lang.Object o : entry.getValue()) {
            resteasyWebTarget.queryParam(entry.getKey(), o);
        }
    }
}