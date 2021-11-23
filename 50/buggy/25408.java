public float getFloat(java.lang.String key, float defaultValue) {
    try {
        return getInt(key);
    } catch (java.util.NoSuchElementException | java.lang.NumberFormatException e) {
        return defaultValue;
    }
}