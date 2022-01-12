public java.lang.Float getFloat(java.lang.String index, float defaultVal) {
    java.lang.Object value = getter(index);
    float results = defaultVal;
    try {
        results = java.lang.Float.parseFloat(value.toString());
    } catch (java.lang.Exception e) {
    }
    return results;
}