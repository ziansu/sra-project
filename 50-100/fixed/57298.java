private <T> java.util.Collection<java.lang.Object> convertValues(javax.xml.namespace.QName propName, java.util.List<com.evolveum.midpoint.prism.PrismPropertyValue<T>> values) throws com.evolveum.midpoint.util.exception.SchemaException {
    if (values == null) {
        return null;
    }
    java.util.Collection<java.lang.Object> convertedValues = new java.util.ArrayList<>();
    for (com.evolveum.midpoint.prism.PrismValue value : values) {
        java.lang.Object converted = com.evolveum.midpoint.provisioning.ucf.util.UcfUtil.convertValueToIcf(value, null, propName);
        convertedValues.add(converted);
    }
    return convertedValues;
}