public java.lang.Double getDouble(java.lang.String index, double defaultValue) {
    java.lang.Object value = getter(index);
    double results = defaultValue;
    try {
        java.lang.String[] values = ((java.lang.String[]) (value));
        results = java.lang.Double.parseDouble(values[0]);
    } catch (java.lang.Exception e) {
    }
    return results;
}