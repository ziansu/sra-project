public java.util.Optional<T> exists(java.util.function.Predicate<? super T> filter) {
    getList().stream().anyMatch(filter);
}