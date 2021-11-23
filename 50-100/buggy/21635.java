protected java.lang.String getStringValue(java.lang.Object element) {
    usingNullOrEmptyValue = false;
    if (element == null) {
        element = nullValue;
        usingNullOrEmptyValue = true;
        if (element == null) {
            return null;
        }
    }
    java.lang.String string = java.lang.String.valueOf(element);
    if (string.isEmpty()) {
        usingNullOrEmptyValue = true;
        return emptyValue;
    }
    return string;
}