public java.lang.String get(java.lang.String name, com.librato.metrics.reporter.Signal signal, com.librato.metrics.reporter.Supplier<java.lang.String> fullNameSupplier) {
    com.librato.metrics.reporter.NameCache.Key key = new com.librato.metrics.reporter.NameCache.Key(name, signal);
    java.lang.String result = cache.get(key);
    if (result == null) {
        result = fullNameSupplier.get();
        cache.set(key, result);
    }
    return result;
}