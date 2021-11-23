public double getDoubleProperty(java.lang.String key, double defaultValue) {
    java.lang.Double result = java.lang.Double.parseDouble(properties.getProperty(key));
    if (result != null) {
        return result;
    }else {
        return defaultValue;
    }
}