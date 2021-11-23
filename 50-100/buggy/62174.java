public java.util.Map<javax.xml.namespace.QName, java.lang.Object> getAnyAttribute(java.lang.Object target) {
    try {
        java.util.Map<javax.xml.namespace.QName, java.lang.Object> map = ((java.util.Map<javax.xml.namespace.QName, java.lang.Object>) (anyAttributeField.get(target)));
        if (map == null) {
            anyAttributeField.set(target, map);
            map = com.google.common.collect.Maps.newHashMap();
        }
        return map;
    } catch (java.lang.IllegalAccessException e) {
        throw new java.lang.IllegalStateException("Error getting field value", e);
    }
}