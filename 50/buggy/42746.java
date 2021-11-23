public double toDouble() throws java.io.IOException {
    if (property.isList) {
        throw new java.lang.UnsupportedOperationException("Can't convert list to double.");
    }
    return get(0).toDouble();
}