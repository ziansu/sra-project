protected boolean applyByServer(com.netflix.niws.loadbalancer.DiscoveryEnabledServer server) {
    final cn.patterncat.ribbon.api.RibbonFilterContext context = cn.patterncat.ribbon.support.RibbonFilterContextHolder.getCurrentContext();
    final java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> attributes = java.util.Collections.unmodifiableSet(context.getAttributes().entrySet());
    final java.util.Map<java.lang.String, java.lang.String> metadata = server.getInstanceInfo().getMetadata();
    boolean result = metadata.entrySet().containsAll(attributes);
    return result;
}