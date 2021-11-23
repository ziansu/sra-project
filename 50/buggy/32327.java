public T first() {
    return value().isEmpty() ? null : value().get(0);
}