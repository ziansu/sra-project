public org.qfox.jestful.core.Mapping lookup(java.lang.String method, java.lang.String URI) throws org.qfox.jestful.server.exception.BadMethodStatusException, org.qfox.jestful.server.exception.NotFoundStatusException {
    java.util.Collection<org.qfox.jestful.core.Mapping> mappings = lookup(URI);
    for (org.qfox.jestful.core.Mapping mapping : mappings) {
        if (mapping.getRestful().getMethod().equalsIgnoreCase(method)) {
            return mapping;
        }
    }
    if (mappings.isEmpty()) {
        throw new org.qfox.jestful.server.exception.NotFoundStatusException(URI, method);
    }else {
        throw new org.qfox.jestful.server.exception.BadMethodStatusException(URI, method, mappings);
    }
}