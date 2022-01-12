public void set(java.lang.String key, java.lang.Object object) {
    if (!(forcedValues.contains(key.toLowerCase()))) {
        data.put(key.toLowerCase(), object);
    }
}