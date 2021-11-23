public java.util.Collection<java.lang.String> getURIs() {
    java.util.Set<java.lang.String> uris = new java.util.HashSet<java.lang.String>();
    if ((delegate) != null) {
        uris.addAll(delegate.getURIs());
    }
    uris.addAll(map.values());
    return uris;
}