@org.junit.Test
public void genWidgetWithRefPropertiesHidden() throws java.lang.Exception {
    java.lang.String jsonStr = org.talend.daikon.serialize.jsonschema.JsonSchemaUtilTest.readJson("ReferenceExampleUiSchema.json");
    org.talend.daikon.properties.ReferenceExampleProperties refEProp = ((org.talend.daikon.properties.ReferenceExampleProperties) (new org.talend.daikon.properties.ReferenceExampleProperties(null).init()));
    org.talend.daikon.properties.ReferenceExampleProperties.TestAProperties testAProp = ((org.talend.daikon.properties.ReferenceExampleProperties.TestAProperties) (new org.talend.daikon.properties.ReferenceExampleProperties.TestAProperties(null).init()));
    refEProp.testAPropReference.setReference(testAProp);
    org.talend.daikon.serialize.jsonschema.UiSchemaGenerator generator = new org.talend.daikon.serialize.jsonschema.UiSchemaGenerator();
    com.fasterxml.jackson.databind.node.ObjectNode uiSchemaJsonObj = generator.genWidget(refEProp, Form.MAIN);
    assertEquals(jsonStr, uiSchemaJsonObj.toString());
}