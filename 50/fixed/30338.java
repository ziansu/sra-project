public void addSupportedProperty(com.whizzosoftware.hobson.api.property.TypedProperty property) {
    if ((supportedProperties) == null) {
        supportedProperties = new java.util.ArrayList<>();
    }
    supportedProperties.add(property);
}