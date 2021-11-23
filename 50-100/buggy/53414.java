@org.testng.annotations.Test
public void testTheCountBean() throws java.lang.Exception {
    final io.swagger.models.Model model = context.resolve(io.swagger.jackson.SimpleGenerationTest.TheCount.class);
    final java.util.Map<java.lang.String, io.swagger.models.properties.Property> props = model.getProperties();
    org.testng.AssertJUnit.assertEquals(props.size(), 1);
    final io.swagger.models.properties.Property prop = props.values().iterator().next();
    org.testng.AssertJUnit.assertEquals(prop.getName(), "theCount");
}