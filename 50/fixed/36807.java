private void verifyIllegal(java.lang.String uri) {
    try {
        new net.ontopia.infoset.impl.basic.URILocator(uri);
        fail((("URI '" + uri) + "' considered legal"));
    } catch (java.net.MalformedURLException e) {
    }
}