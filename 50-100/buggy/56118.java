private boolean shouldSplit(java.lang.Object value) {
    if (!(value instanceof java.util.List)) {
        return true;
    }
    java.util.List<?> listValue = ((java.util.List<?>) (value));
    if ((listValue.size()) > (IN_MAX_SIZE)) {
        return true;
    }
    return false;
}