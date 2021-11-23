public static java.lang.String buildIdentifier(java.lang.String handle) {
    if ((org.lareferencia.xoai.data.RepostioryItem._prefix) == null) {
        org.lareferencia.xoai.data.RepostioryItem._prefix = org.lareferencia.xoai.ConfigurationManager.getProperty("identifier.prefix");
    }
    return (("oai:" + (org.lareferencia.xoai.data.RepostioryItem._prefix)) + ":") + handle;
}