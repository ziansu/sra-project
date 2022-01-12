private void verifyResolveInvalid(java.lang.String base, java.lang.String uri) {
    try {
        new net.ontopia.infoset.impl.basic.URILocator(base).resolveAbsolute(uri);
        org.junit.Assert.fail((((("URI '" + uri) + "' relative to '") + base) + "' considered legal"));
    } catch (net.ontopia.utils.OntopiaRuntimeException e) {
    } catch (java.net.MalformedURLException e) {
        org.junit.Assert.fail((("Base URI '" + base) + "' considered illegal"));
    }
}