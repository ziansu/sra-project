public java.lang.String get(com.librato.metrics.reporter.Signal signal, com.librato.metrics.reporter.Supplier<java.lang.String> fullNameSupplier) {
    java.lang.String result = cache.get(signal);
    if (result == null) {
        result = fullNameSupplier.get();
        cache.set(signal, result);
    }
    return result;
}