@org.junit.Test
public void createExplodedVarSpecFromUriTemplateBuilder() throws java.lang.Exception {
    com.damnhandy.uri.template.impl.VarSpec varSpec = com.damnhandy.uri.template.UriTemplateBuilder.var("experiment", true);
    org.junit.Assert.assertEquals("experiment*", varSpec.getVariableName());
}