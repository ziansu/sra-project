@java.lang.Override
public java.net.URL toURL(java.net.URI uri) {
    this.validateScheme(uri);
    java.lang.String s = "";
    try {
        s = this.createURL(uri);
        java.net.URL url = null;
        url = new java.net.URL(s);
        ca.nrc.cadc.caom2.artifact.resolvers.MastResolver.log.debug(((uri + " --> ") + url));
        return url;
    } catch (java.net.MalformedURLException ex) {
        throw new java.lang.RuntimeException(("BUG: could not generate URL from uri " + s), ex);
    }
}