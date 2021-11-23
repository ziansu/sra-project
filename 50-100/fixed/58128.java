public javax.naming.Context getInitialContext(java.util.Hashtable hashtable) throws javax.naming.NamingException {
    if (org.apache.naming.ContextBindings.isClassLoaderBound()) {
        return new org.wso2.carbon.tomcat.jndi.CarbonSelectorContext(hashtable, true, initialContext);
    }
    if ((initialContext) == null) {
        initialContext = new org.apache.naming.NamingContext(hashtable, MAIN);
    }
    return initialContext;
}