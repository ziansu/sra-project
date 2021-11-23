public static java.lang.String nameToKey(java.lang.String name) {
    java.lang.String key = name.toLowerCase();
    key = key.trim();
    key = key.replaceAll(" ", "_");
    return key;
}