@org.junit.Test
public void testWithExplodeModifier() throws java.lang.Exception {
    com.damnhandy.uri.template.impl.VarSpec varSpec = new com.damnhandy.uri.template.impl.VarSpec("experiment*", Modifier.EXPLODE, null);
    org.junit.Assert.assertEquals("experiment", varSpec.getVariableName());
}