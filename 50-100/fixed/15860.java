public void addKey(java.lang.String key, int defaultValue, int min, int max, java.lang.String comment) {
    java.lang.String category = this.getCategory();
    int value = config.getInt(key, category, defaultValue, min, max, comment);
    this.keys.put(key, new java.lang.Integer(value));
}