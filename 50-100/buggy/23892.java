@java.lang.Override
public void onResponse(com.linkedin.r2.message.rest.StreamResponse res, com.linkedin.r2.message.RequestContext requestContext, java.util.Map<java.lang.String, java.lang.String> wireAttrs, com.linkedin.r2.filter.NextFilter<com.linkedin.r2.message.rest.StreamRequest, com.linkedin.r2.message.rest.StreamResponse> nextFilter) {
    final com.linkedin.r2.filter.Filter filter = _filter;
    ((com.linkedin.r2.filter.message.rest.StreamResponseFilter) (filter)).onResponse(res, requestContext, wireAttrs, nextFilter);
}