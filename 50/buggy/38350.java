public T getValue() {
    if (values.isEmpty()) {
        return null;
    }else {
        return values.iterator().next();
    }
}