@java.lang.Override
public java.security.Principal apply(org.apache.jackrabbit.api.security.user.Authorizable authorizable) {
    if (authorizable == null) {
        return null;
    }
    try {
        return authorizable.getPrincipal();
    } catch (javax.jcr.RepositoryException e) {
        java.lang.String msg = "Internal error while retrieving principal: " + (e.getMessage());
        org.apache.jackrabbit.oak.security.user.AbstractGroupPrincipal.log.error(msg);
        throw new java.lang.IllegalStateException(msg);
    }
}