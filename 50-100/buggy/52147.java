public static void register(java.lang.String method_url, java.lang.Class<? extends water.Handler> hclass, java.lang.String method, java.lang.String apiName, java.lang.String summary) {
    if (water.H2O._doneRequests)
        throw new java.lang.IllegalArgumentException("Cannot add more Requests once the list is finalized");
    
    water.api.RequestServer.register(method_url, hclass, method, apiName, summary);
}