private java.lang.String getDomainName(java.lang.String url) {
    java.net.URI uri;
    try {
        uri = new java.net.URI(url);
        if (uri != null) {
            java.lang.String domain = uri.getHost();
            if (domain != null) {
                return domain;
            }
        }
    } catch (java.net.URISyntaxException e) {
        e.printStackTrace();
    }
    return null;
}