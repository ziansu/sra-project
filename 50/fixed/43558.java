public com.composum.sling.core.RequestHandle getRequest() {
    if ((request) == null) {
        request = com.composum.sling.core.RequestHandle.use(context.getRequest());
    }
    return request;
}