private javax.jcr.Session getSession(final org.apache.sling.api.resource.ResourceResolver resolver) throws javax.jcr.RepositoryException, org.apache.sling.api.resource.LoginException {
    return resolver.adaptTo(javax.jcr.Session.class);
}