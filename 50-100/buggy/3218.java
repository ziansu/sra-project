@org.junit.Test
public void genWidget() throws java.lang.Exception {
    java.lang.String jsonStr = org.talend.daikon.serialize.jsonschema.JsonSchemaUtilTest.readJson("FullExampleUiSchema.json");
    org.talend.daikon.serialize.FullExampleProperties properties = new org.talend.daikon.serialize.FullExampleProperties("fullexample");
    properties.init();
    org.talend.daikon.serialize.jsonschema.UiSchemaGenerator generator = new org.talend.daikon.serialize.jsonschema.UiSchemaGenerator();
    java.lang.System.out.println(generator.genWidget(properties, Form.MAIN).toString());
    org.junit.Assert.assertEquals(jsonStr, generator.genWidget(properties, Form.MAIN).toString());
}