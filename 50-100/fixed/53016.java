private double getFeatureValue(java.lang.String key) {
    double value = 0.0;
    @java.lang.SuppressWarnings(value = "unchecked")
    java.lang.String valueString = ((java.lang.String) (featureCacheClient.get(key)));
    if (!(com.google.common.base.Strings.isNullOrEmpty(valueString))) {
        value = java.lang.Double.parseDouble(valueString);
    }
    return value;
}