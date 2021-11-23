public <T> T execute(final java.util.function.Supplier<T> function) {
    return execute(( t) -> function.get());
}