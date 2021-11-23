private boolean isFeatureValuePairValid(java.lang.String feature, java.lang.String value) {
    if (viewApplicabilitiesMap.containsKey(feature)) {
        java.util.Collection<java.lang.String> validValues = viewApplicabilitiesMap.get(feature);
        value = (value.equalsIgnoreCase("Default")) ? getDefaultValue(feature) : value;
        if (containsIgnoreCase(validValues, value)) {
            return true;
        }
    }
    return false;
}