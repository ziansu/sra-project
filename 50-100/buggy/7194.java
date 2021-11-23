private <T> T getValue(java.lang.String model, java.lang.String propertyName, java.lang.String subPropertyName, T defaultValue) {
    com.dd.plist.NSDictionary dictionary = getValue(model, propertyName, null);
    if ((dictionary != null) && (dictionary.containsKey(subPropertyName))) {
        return ((T) (dictionary.get(subPropertyName)));
    }
    return defaultValue;
}