private static java.net.URI getResourceUri(java.lang.Class<?> klass) throws java.net.URISyntaxException {
    return cypher.SpecSuiteResources.getResourceUriClass(klass).getResource("").toURI();
}