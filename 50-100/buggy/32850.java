private java.util.Map<java.lang.String, java.lang.String> getAttributes(java.util.Map<java.lang.String, java.lang.Object> node) {
    java.util.Map<java.lang.String, java.lang.String> attrMap = new java.util.LinkedHashMap<java.lang.String, java.lang.String>();
    for (java.lang.String fieldname : node.keySet()) {
        java.lang.String value = ((java.lang.String) (node.get(fieldname)));
        if (org.apache.commons.lang3.StringUtils.isNotBlank(value)) {
            attrMap.put(fieldname, value);
        }
    }
    return attrMap;
}