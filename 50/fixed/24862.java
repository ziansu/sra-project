private java.lang.String encodeName(final com.librato.metrics.reporter.Signal signal) {
    return com.librato.metrics.reporter.Librato.nameCache.get(signal, new com.librato.metrics.reporter.Supplier<java.lang.String>() {
        @java.lang.Override
        public java.lang.String get() {
            return com.librato.metrics.reporter.Json.serialize(signal);
        }
    });
}