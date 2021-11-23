private java.lang.String toJsonType(io.swagger.models.properties.Property p) {
    if (p instanceof io.swagger.models.properties.StringProperty) {
        return "string";
    }
    if (p instanceof io.swagger.models.properties.BooleanProperty) {
        return "boolean";
    }
    if ((((p instanceof io.swagger.models.properties.DoubleProperty) || (p instanceof io.swagger.models.properties.FloatProperty)) || (p instanceof io.swagger.models.properties.IntegerProperty)) || (p instanceof io.swagger.models.properties.LongProperty)) {
        return "number";
    }
    return null;
}