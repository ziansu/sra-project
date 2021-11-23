protected java.lang.String getStringValue(java.lang.Object element) {
    usingNullOrEmptyValue = false;
    if (element == null) {
        usingNullOrEmptyValue = true;
        return null;
    }
    java.lang.String string = java.lang.String.valueOf(element);
    if (string.isEmpty()) {
        usingNullOrEmptyValue = true;
        return emptyValue;
    }
    return string;
}