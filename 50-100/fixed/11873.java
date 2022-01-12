@org.junit.Test
public void testDoubleUiOrderElementIssue() throws java.lang.Exception {
    org.talend.daikon.serialize.jsonschema.UiSchemaGeneratorTest.AProperties aProperties = new org.talend.daikon.serialize.jsonschema.UiSchemaGeneratorTest.AProperties("foo");
    aProperties.init();
    org.talend.daikon.serialize.jsonschema.UiSchemaGenerator generator = new org.talend.daikon.serialize.jsonschema.UiSchemaGenerator();
    com.fasterxml.jackson.databind.node.ObjectNode uiSchemaJsonObj = generator.genWidget(aProperties, "MyForm");
    java.lang.String expectedPartial = "{\"ui:order\":[\"myStr\",\"np\"]}";
    assertEquals(expectedPartial, uiSchemaJsonObj.toString(), false);
}