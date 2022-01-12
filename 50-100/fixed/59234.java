@java.lang.Override
public void onRequest(com.linkedin.r2.message.rest.StreamRequest req, com.linkedin.r2.message.RequestContext requestContext, java.util.Map<java.lang.String, java.lang.String> wireAttrs, com.linkedin.r2.filter.NextFilter<com.linkedin.r2.message.rest.StreamRequest, com.linkedin.r2.message.rest.StreamResponse> nextFilter) {
    if ((_filter) instanceof com.linkedin.r2.filter.message.rest.StreamRequestFilter) {
        ((com.linkedin.r2.filter.message.rest.StreamRequestFilter) (_filter)).onRequest(req, requestContext, wireAttrs, nextFilter);
    }else {
        nextFilter.onRequest(req, requestContext, wireAttrs);
    }
}