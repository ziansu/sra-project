void ifPresent(java.util.function.Consumer<V> modifier) {
    if (isPresent()) {
        modifier.accept(cachedValue.get());
    }
}