public void addKey(java.lang.String key, boolean defaultValue, java.lang.String comment) {
    java.lang.String category = this.getCategory();
    boolean value = config.getBoolean(key, category, defaultValue, comment);
    this.keys.put(key, new java.lang.Boolean(value));
}