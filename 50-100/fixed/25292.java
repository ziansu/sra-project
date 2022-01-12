protected java.util.Set<java.lang.String> fetchClasses(final java.lang.String classType) {
    final java.util.Set<java.lang.String> ops = new java.util.HashSet<>();
    for (final java.lang.String url : config.getUrls()) {
        final java.util.Set<java.lang.String> classes = requestor.doGet(url, ("graph/" + classType), new uk.gov.gchq.gaffer.federated.rest.TypeReferenceFederatedImpl.SetString(), null, true);
        if (null != classes) {
            ops.addAll(classes);
        }
    }
    return java.util.Collections.unmodifiableSet(ops);
}