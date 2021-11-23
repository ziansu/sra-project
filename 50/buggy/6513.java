public int getPropAsInt(java.lang.String key, int def) {
    return java.lang.Integer.valueOf(getProperty(key, java.lang.String.valueOf(def)));
}