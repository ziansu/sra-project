public T first() {
    if (null == (value())) {
        return null;
    }
    return value().isEmpty() ? null : value().get(0);
}