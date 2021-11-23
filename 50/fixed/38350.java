public T getValue() {
    if (!(values.isEmpty())) {
        return values.iterator().next();
    }
    return null;
}