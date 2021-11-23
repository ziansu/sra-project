private void normalizesTo(java.lang.String url, java.lang.String result) {
    try {
        java.lang.String normalized = new net.ontopia.infoset.impl.basic.URILocator(url).getAddress();
        assertTrue((((("'" + url) + "' normalized to '") + normalized) + "'"), normalized.equals(result));
    } catch (java.net.MalformedURLException e) {
        throw new net.ontopia.utils.OntopiaRuntimeException(("ERROR: " + e));
    }
}