public <T> T withMetrics(java.lang.String name, java.util.function.Supplier<T> s) {
    return withMetrics(name, java.util.Arrays.asList(), s);
}