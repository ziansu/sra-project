public void updateProperty(java.lang.String propertyName, java.lang.String value) {
    org.jdom.Element properties = root.getChild("properties", nameSpace);
    if (properties == null) {
        throw new java.lang.IllegalArgumentException(("No properties defined in module " + (gav())));
    }
    org.jdom.Element property = properties.getChild(propertyName, nameSpace);
    if (property == null) {
        throw new java.lang.IllegalArgumentException(((("No property " + propertyName) + " defined in module ") + (gav())));
    }
    property.setText(value);
}