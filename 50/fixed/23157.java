private java.lang.String computeAppUrl(java.lang.String appName, java.lang.String domainName) {
    return (appName + ".") + ((domainName.equals("")) || (domainName.equals(appName)) ? defaultDomainName : domainName);
}