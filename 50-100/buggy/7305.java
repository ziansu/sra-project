private static java.util.Properties loadSettings(data.Element p_element) {
    java.util.Properties x_settings = new java.util.Properties();
    java.util.List x_properties = p_element.getChildren();
    for (java.lang.Object x_property : x_properties) {
        data.Element x_propertyElem = ((data.Element) (x_property));
        x_settings.setProperty(x_propertyElem.getAttributeValue(XmlConstants.s_PROPERTY_NAME), x_propertyElem.getAttributeValue(XmlConstants.s_PROPERTY_VALUE));
    }
    return x_settings;
}