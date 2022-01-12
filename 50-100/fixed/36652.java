private void verifyResolveInvalid(java.lang.String base, java.lang.String uri) {
    try {
        new net.ontopia.infoset.impl.basic.URILocator(base).resolveAbsolute(uri);
        fail((((("URI '" + uri) + "' relative to '") + base) + "' considered legal"));
    } catch (net.ontopia.utils.OntopiaRuntimeException e) {
    } catch (java.net.MalformedURLException e) {
        fail((("Base URI '" + base) + "' considered illegal"));
    }
}