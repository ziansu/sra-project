public java.util.List<java.lang.String> toList(java.util.List<java.lang.String> exportField) {
    java.util.Map<java.lang.String, java.lang.Object> schemaValueMap = this.getSchemaValueMap();
    java.util.List<java.lang.String> schema = fetchSchema();
    return schema.stream().map(( field) -> schemaValueMap.get(field).toString()).collect(java.util.stream.Collectors.toList());
}