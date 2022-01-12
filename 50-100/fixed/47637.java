private com.sandbox.runtime.models.MatchedRouteDetails findMatchedRoute(com.sandbox.runtime.models.HttpRuntimeRequest request, com.sandbox.runtime.models.RoutingTable table) throws java.lang.Exception {
    com.sandbox.runtime.models.MatchedRouteDetails match = table.findMatch(request.getMethod(), request.getUrl(), request.getHeaders());
    if (match == null)
        return null;
    
    java.util.Map<java.lang.String, java.lang.String> flattenedPathParams = mapUtils.flattenMultiValue(match.getPathParams(), URITemplate.FINAL_MATCH_GROUP);
    request.setPath(match.getPath());
    request.setParams(flattenedPathParams);
    return match;
}