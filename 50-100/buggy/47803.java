private void addFixedAttribute(com.orhanobut.tracklytics.FixedAttribute attribute, java.util.Map<java.lang.String, java.lang.Object> values) {
    if (attribute != null) {
        values.put(attribute.key(), attribute.value());
        if (attribute.isSuper()) {
            superAttributes.put(attribute.key(), attribute.value());
        }
    }
}