private static java.lang.String getParentDomain(java.lang.String domain) {
    domain = uk.bl.api.OverallLicenseStatus.stripWWW(domain);
    com.google.common.net.InternetDomainName idn = com.google.common.net.InternetDomainName.from(domain);
    if (idn.isTopPrivateDomain())
        return idn.toString();
    
    return idn.parent().toString();
}