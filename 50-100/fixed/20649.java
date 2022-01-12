private org.wso2.developerstudio.datamapper.Element createElement(int count, java.lang.String elementKey, java.util.Map<java.lang.String, java.lang.Object> subSchema, java.lang.String schemaType) {
    org.wso2.developerstudio.datamapper.org.wso2.developerstudio.datamapper.Element element;
    element = DataMapperFactory.eINSTANCE.createElement();
    element.setName(elementKey);
    element.setLevel(count);
    element.getProperties().put(org.wso2.developerstudio.datamapper.diagram.tree.generator.SchemaTransformer.JSON_SCHEMA_TYPE, schemaType);
    if ((getIDValue(subSchema)) != null) {
        element.getProperties().put(org.wso2.developerstudio.datamapper.diagram.tree.generator.SchemaTransformer.JSON_SCHEMA_ID, getIDValue(subSchema));
    }
    return element;
}