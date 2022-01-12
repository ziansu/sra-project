public boolean getBooleanProperty(java.lang.String key) {
    java.lang.String stringProperty = getStringProperty(key).trim();
    return (stringProperty != null) && (((stringProperty.equalsIgnoreCase("true")) || (stringProperty.equalsIgnoreCase("yes"))) || (stringProperty.equals("1")));
}