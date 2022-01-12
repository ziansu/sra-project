public double getDoubleProperty(java.lang.String key, double defaultValue) {
    java.lang.Double result = java.lang.Double.parseDouble(properties.getProperty(key));
    return result;
}