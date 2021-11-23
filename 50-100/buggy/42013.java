private java.util.List<models.Property> getProperties(java.lang.String propertiesStr) {
    java.lang.String[] properties = propertiesStr.split(";");
    java.util.List<models.Property> property = new java.util.ArrayList<models.Property>();
    for (java.lang.String str : properties) {
        java.lang.String[] keyValues = str.split(":");
        models.Property pr = new models.Property();
        pr.setPropertyName(keyValues[0]);
        pr.setValues(getValues(keyValues[1]));
    }
    return property;
}