public static java.lang.String getDomainName(java.lang.String url) throws java.net.URISyntaxException {
    java.net.URI uri = new java.net.URI(url);
    java.lang.String domain = uri.getHost();
    if (domain == null) {
        return url.replaceAll("www.", "");
    }
    return domain.replaceAll("www.", "");
}