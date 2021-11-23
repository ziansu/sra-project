@java.lang.SuppressWarnings(value = "rawtypes")
private void insetIDAndTypeForJsonObject(org.wso2.developerstudio.datamapper.TreeNode node, java.util.Map nodeObject) {
    java.lang.String schemaType = getPropertyKeyValuePairforTreeNode(node, org.wso2.developerstudio.datamapper.diagram.tree.generator.SchemaTransformer.JSON_SCHEMA_TYPE);
    java.lang.String schemaID = getPropertyKeyValuePairforTreeNode(node, org.wso2.developerstudio.datamapper.diagram.tree.generator.SchemaTransformer.JSON_SCHEMA_ID);
    insertIDandTypeforItemsBlock(nodeObject, schemaID, schemaType);
}