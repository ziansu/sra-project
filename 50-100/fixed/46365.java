@java.lang.SuppressWarnings(value = "unchecked")
private static java.util.List<org.apache.solr.client.solrj.request.schema.FieldTypeDefinition> getFieldTypeDefinitions(java.util.Map schemaNamedList) {
    java.util.List<org.apache.solr.client.solrj.request.schema.FieldTypeDefinition> fieldTypeDefinitions = new java.util.LinkedList<>();
    java.util.List<org.apache.solr.common.util.NamedList<java.lang.Object>> fieldsResponse = ((java.util.List<org.apache.solr.common.util.NamedList<java.lang.Object>>) (schemaNamedList.get("fieldTypes")));
    for (org.apache.solr.common.util.NamedList<java.lang.Object> fieldNamedList : fieldsResponse) {
        org.apache.solr.client.solrj.request.schema.FieldTypeDefinition fieldTypeDefinition = org.apache.solr.client.solrj.response.schema.SchemaResponse.createFieldTypeDefinition(fieldNamedList);
        fieldTypeDefinitions.add(fieldTypeDefinition);
    }
    return fieldTypeDefinitions;
}