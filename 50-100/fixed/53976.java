public void addKey(java.lang.String key, float defaultValue, float min, float max, java.lang.String comment) {
    java.lang.String category = this.getCategory();
    float value = config.getFloat(key, category, defaultValue, min, max, comment);
    this.keys.put(key, new java.lang.Float(value));
}