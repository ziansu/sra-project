public java.lang.Float getFloat(java.lang.String index, float defaultVal) {
    java.lang.Object value = getter(index);
    float results = defaultVal;
    try {
        java.lang.String[] values = ((java.lang.String[]) (value));
        results = java.lang.Float.parseFloat(values[0]);
    } catch (java.lang.Exception e) {
    }
    return results;
}