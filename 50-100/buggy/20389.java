private java.util.List<java.util.Map> getConstraints(java.util.Map<java.lang.String, java.lang.Object> m, java.lang.String propertyName) {
    java.util.Map<java.lang.String, java.util.Map> properties = ((java.util.Map) (m.get("properties")));
    java.util.Map<java.lang.String, java.util.List> property = properties.get(propertyName);
    java.util.List<java.util.Map> constraints = property.get("constraints");
    return constraints;
}