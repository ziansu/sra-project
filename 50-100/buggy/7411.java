private void addFixedAttributes(com.orhanobut.tracklytics.FixedAttributes fixedAttributes, java.util.Map<java.lang.String, java.lang.Object> values) {
    if (fixedAttributes != null) {
        com.orhanobut.tracklytics.FixedAttribute[] attributes = fixedAttributes.value();
        for (com.orhanobut.tracklytics.FixedAttribute attribute : attributes) {
            values.put(attribute.key(), attribute.value());
            if (attribute.isSuper()) {
                superAttributes.put(attribute.key(), attribute.value());
            }
        }
    }
}