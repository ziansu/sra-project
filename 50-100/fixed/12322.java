@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
private void insertIDandTypeforItemsBlock(java.util.Map itemsObject, java.lang.String schemaArrayItemsID, java.lang.String schemaArrayItemsType) {
    if (schemaArrayItemsID != null) {
        itemsObject.put(org.wso2.developerstudio.datamapper.diagram.tree.generator.SchemaTransformer.JSON_SCHEMA_ID, schemaArrayItemsID.replace("\\", ""));
    }else {
        itemsObject.put(org.wso2.developerstudio.datamapper.diagram.tree.generator.SchemaTransformer.JSON_SCHEMA_ID, "");
    }
    itemsObject.put(org.wso2.developerstudio.datamapper.diagram.tree.generator.SchemaTransformer.JSON_SCHEMA_TYPE, schemaArrayItemsType);
}