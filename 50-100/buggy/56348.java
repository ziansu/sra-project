public static javax.slee.resource.ConfigProperties toProperties(org.mobicents.slee.container.management.console.client.PropertiesInfo propertiesInfo) {
    javax.slee.resource.ConfigProperties properties = new javax.slee.resource.ConfigProperties();
    for (java.lang.String key : propertiesInfo.keySet()) {
        java.lang.String[] nameAndType = key.split(" :: ", 2);
        java.lang.String value = propertiesInfo.getProperty(nameAndType[0]);
        javax.slee.resource.ConfigProperties.Property property = new javax.slee.resource.ConfigProperties.Property(nameAndType[0], nameAndType[1], value);
        properties.addProperty(property);
    }
    return properties;
}