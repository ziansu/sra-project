@java.lang.Override
public java.util.Set<java.lang.String> getCurrentConfigurationPaths() {
    javax.jcr.Session session = null;
    java.util.Set<java.lang.String> paths = new java.util.LinkedHashSet<java.lang.String>();
    try {
        session = repository.loginAdministrative(null);
        paths = getNewestConfigurationNodes(configurationPath, session, null).keySet();
    } catch (java.lang.Exception e) {
    } finally {
        if (session != null) {
            session.logout();
        }
    }
    return paths;
}