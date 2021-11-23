public T getOrCompute(java.util.function.Supplier<T> supplier) {
    return (value) == null ? maybeCompute(supplier) : value;
}