protected void addParameters(net.sf.saxon.query.DynamicQueryContext dynamicQueryContext, java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String parameterPrefix) {
    java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> propertyEntries = map.entrySet();
    for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : propertyEntries) {
        dynamicQueryContext.setParameter(net.sf.saxon.om.StructuredQName.fromClarkName((parameterPrefix + (entry.getKey()))), new net.sf.saxon.value.ObjectValue(entry.getValue()));
    }
}