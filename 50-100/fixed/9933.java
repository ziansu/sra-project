@javax.annotation.Nonnull
private org.apache.directory.ldap.client.api.LdapConnection connect() throws org.apache.jackrabbit.oak.spi.security.authentication.external.ExternalIdentityException {
    try {
        if ((adminPool) == null) {
            return adminConnectionFactory.makeObject();
        }else {
            return adminPool.getConnection();
        }
    } catch (java.lang.Exception e) {
        java.lang.String msg = "Error while connecting to the ldap server.";
        org.apache.jackrabbit.oak.security.authentication.ldap.impl.LdapIdentityProvider.log.error(msg, e);
        throw new org.apache.jackrabbit.oak.spi.security.authentication.external.ExternalIdentityException(msg, e);
    }
}