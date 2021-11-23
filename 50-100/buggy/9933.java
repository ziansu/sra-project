@javax.annotation.Nonnull
private org.apache.directory.ldap.client.api.LdapConnection connect() throws org.apache.jackrabbit.oak.spi.security.authentication.external.ExternalIdentityException {
    try {
        if ((adminPool) == null) {
            return adminConnectionFactory.makeObject();
        }else {
            return adminPool.getConnection();
        }
    } catch (java.lang.Throwable e) {
        org.apache.jackrabbit.oak.security.authentication.ldap.impl.LdapIdentityProvider.log.error("Error while connecting to the ldap server.", e);
        throw new org.apache.jackrabbit.oak.spi.security.authentication.external.ExternalIdentityException("Error while connecting and binding to the ldap server", e);
    }
}