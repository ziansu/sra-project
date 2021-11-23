private void resolvesTo(java.lang.String base, java.lang.String url, java.lang.String result) {
    try {
        java.lang.String resolved = new net.ontopia.infoset.impl.basic.URILocator(base).resolveAbsolute(url).getAddress();
        org.junit.Assert.assertTrue((((((("'" + url) + "' relative to '") + base) + "' became '") + resolved) + "'"), resolved.equals(result));
    } catch (java.net.MalformedURLException e) {
        org.junit.Assert.fail(("IMPOSSIBLE ERROR: " + e));
    }
}