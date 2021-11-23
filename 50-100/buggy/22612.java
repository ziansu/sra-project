private synchronized org.apache.sling.api.resource.ResourceResolver getResourceResolver(org.apache.sling.api.resource.ResourceResolverFactory resourceResolverFactory) {
    com.headwire.pageUploader.services.impl.TranslationCoreEventListener.log.trace("LQ == Starting function: getResourceResolver");
    org.apache.sling.api.resource.ResourceResolver resourceResolver = null;
    java.util.Map<java.lang.String, java.lang.Object> param = new java.util.HashMap<java.lang.String, java.lang.Object>();
    param.put(ResourceResolverFactory.SUBSERVICE, "readService");
    param.put(ResourceResolverFactory.USER, "cloudwords-service");
    try {
        resourceResolver = resourceResolverFactory.getServiceResourceResolver(param);
        org.apache.sling.api.resource.Resource res = resourceResolver.getResource("/content/geometrixx");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return resourceResolver;
}