private static java.lang.String getNameMethodByKey(java.lang.String key) {
    return ("set" + (key.substring(0, 1).toUpperCase())) + (key.substring(1));
}