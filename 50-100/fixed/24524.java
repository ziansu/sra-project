public static java.lang.Object getKeyValue(java.lang.String scope, java.lang.String key) {
    if ((org.jenkinsci.plugins.puppetenterprise.models.HieraConfig.hierarchy.get(scope)) == null) {
        return null;
    }
    java.util.HashMap scopeHierarchy = ((java.util.HashMap) (org.jenkinsci.plugins.puppetenterprise.models.HieraConfig.hierarchy.get(scope)));
    if ((scopeHierarchy.get(key)) == null) {
        return null;
    }
    java.util.HashMap keyData = ((java.util.HashMap) (scopeHierarchy.get(key)));
    return keyData.get("value");
}