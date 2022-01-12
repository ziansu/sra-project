@java.lang.Override
public void onResponse(com.linkedin.r2.message.rest.StreamResponse res, com.linkedin.r2.message.RequestContext requestContext, java.util.Map<java.lang.String, java.lang.String> wireAttrs, com.linkedin.r2.filter.NextFilter<com.linkedin.r2.message.rest.StreamRequest, com.linkedin.r2.message.rest.StreamResponse> nextFilter) {
    if ((_filter) instanceof com.linkedin.r2.filter.message.rest.StreamResponseFilter) {
        ((com.linkedin.r2.filter.message.rest.StreamResponseFilter) (_filter)).onResponse(res, requestContext, wireAttrs, nextFilter);
    }else {
        nextFilter.onResponse(res, requestContext, wireAttrs);
    }
}