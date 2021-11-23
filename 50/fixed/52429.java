private java.lang.String getKey(final java.lang.String key) {
    return key + (isValidContent() ? " for client" : " for admin");
}