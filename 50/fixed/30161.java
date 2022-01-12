static java.lang.Long getKeyAsLong(java.lang.String key) {
    java.lang.String key_string = key.replace("user", "");
    return java.lang.Long.parseLong(key_string);
}