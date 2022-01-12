public static java.lang.Object getKeyValue(java.lang.String scope, java.lang.String key) {
    java.util.HashMap scopeHierarchy = ((java.util.HashMap) (org.jenkinsci.plugins.puppetenterprise.models.HieraConfig.hierarchy.get(scope)));
    if (scopeHierarchy == null) {
        return null;
    }
    java.util.HashMap keyData = ((java.util.HashMap) (scopeHierarchy.get(key)));
    return keyData.get("value");
}