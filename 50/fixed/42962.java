public long getPropAsLong(java.lang.String key, long def) {
    return java.lang.Long.parseLong(getProperty(key, java.lang.String.valueOf(def)));
}