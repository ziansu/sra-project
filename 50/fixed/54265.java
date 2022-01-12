public boolean toBool() throws java.io.IOException {
    if (property.isList) {
        throw new java.lang.UnsupportedOperationException("Can't convert list to a boolean.");
    }
    if ((super.isEmpty()) == false) {
        return get(0).toBool();
    }
    return false;
}