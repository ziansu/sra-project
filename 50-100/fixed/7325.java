private java.util.Set<java.security.Principal> collectPrincipals(final javax.jcr.Credentials credentials) {
    final java.util.Set<java.security.Principal> principals = new java.util.HashSet<>();
    for (final org.fcrepo.auth.common.PrincipalProvider p : this.getPrincipalProviders()) {
        final java.util.Set<java.security.Principal> ps = p.getPrincipals(credentials);
        if (ps != null) {
            principals.addAll(p.getPrincipals(credentials));
        }
    }
    return principals;
}