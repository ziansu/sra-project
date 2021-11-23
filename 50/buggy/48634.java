private javax.jcr.Session getSession() throws javax.jcr.RepositoryException, org.apache.sling.api.resource.LoginException {
    final org.apache.sling.api.resource.ResourceResolver resolver = resourceResolverFactory.getServiceResourceResolver(java.util.Collections.EMPTY_MAP);
    return resolver.adaptTo(javax.jcr.Session.class);
}