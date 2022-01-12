public boolean getBooleanProperty(java.lang.String key) {
    java.lang.String stringProperty = getStringProperty(key);
    return (stringProperty != null) && (((stringProperty.trim().equalsIgnoreCase("true")) || (stringProperty.trim().equalsIgnoreCase("yes"))) || (stringProperty.trim().equals("1")));
}