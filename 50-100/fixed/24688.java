public static com.google.common.collect.ImmutableList<java.lang.String> allLevels(java.lang.String host) {
    com.google.common.net.InternetDomainName domainName;
    try {
        domainName = com.google.common.net.InternetDomainName.from(host);
    } catch (java.lang.NullPointerException e) {
        return null;
    }
    return uk.bl.wa.extract.LinkExtractor.parentLevels(domainName).build();
}