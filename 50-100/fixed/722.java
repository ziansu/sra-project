public static java.lang.String getDomainName(java.lang.String url) throws java.net.URISyntaxException {
    java.net.URI uri = new java.net.URI(url);
    java.lang.String domain = uri.getHost();
    if (domain == null) {
        return url.startsWith("www.") ? url.substring(4) : url;
    }
    return domain.startsWith("www.") ? domain.substring(4) : domain;
}