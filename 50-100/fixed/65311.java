public com.whizzosoftware.hobson.api.property.TypedProperty getSupportedProperty(java.lang.String id) {
    if ((supportedProperties) != null) {
        for (com.whizzosoftware.hobson.api.property.TypedProperty tp : supportedProperties) {
            if (((tp.getId()) != null) && (tp.getId().equals(id))) {
                return tp;
            }
        }
    }
    return null;
}