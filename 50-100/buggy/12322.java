@java.lang.SuppressWarnings(value = "unchecked")
private void insertIDandTypeforItemsBlock(org.json.simple.JSONObject itemsObject, java.lang.String schemaArrayItemsID, java.lang.String schemaArrayItemsType) {
    if (schemaArrayItemsID != null) {
        itemsObject.put(org.wso2.developerstudio.datamapper.diagram.tree.generator.SchemaTransformer.JSON_SCHEMA_ID, schemaArrayItemsID.replace("\\", ""));
    }else {
        itemsObject.put(org.wso2.developerstudio.datamapper.diagram.tree.generator.SchemaTransformer.JSON_SCHEMA_ID, "");
    }
    itemsObject.put(org.wso2.developerstudio.datamapper.diagram.tree.generator.SchemaTransformer.JSON_SCHEMA_TYPE, schemaArrayItemsType);
}