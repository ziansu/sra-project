public java.lang.Double getDouble(java.lang.String index, double defaultValue) {
    java.lang.Object value = getter(index);
    double results = defaultValue;
    try {
        results = java.lang.Double.parseDouble(value.toString());
    } catch (java.lang.Exception e) {
    }
    return results;
}