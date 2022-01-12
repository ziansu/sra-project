private static javax.naming.ldap.LdapContext createLdapContext(java.lang.String url, java.lang.String bindDn, java.lang.String bindCredential) throws javax.naming.NamingException {
    java.util.Hashtable<java.lang.String, java.lang.String> environment = new java.util.Hashtable<>();
    environment.put(javax.naming.Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
    environment.put(javax.naming.Context.PROVIDER_URL, url);
    environment.put(javax.naming.Context.SECURITY_AUTHENTICATION, "simple");
    environment.put(javax.naming.Context.SECURITY_PRINCIPAL, bindDn);
    environment.put(javax.naming.Context.SECURITY_CREDENTIALS, bindCredential);
    try {
        return new javax.naming.ldap.InitialLdapContext(environment, null);
    } catch (javax.naming.NamingException e) {
        throw e;
    }
}