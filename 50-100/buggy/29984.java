@org.junit.Test
public void testGetDoubleProperty_default() throws java.lang.Exception {
    nl.esciencecenter.xenon.engine.util.ImmutableArray<nl.esciencecenter.xenon.XenonPropertyDescription> valid = new nl.esciencecenter.xenon.engine.util.ImmutableArray<nl.esciencecenter.xenon.XenonPropertyDescription>(new nl.esciencecenter.xenon.engine.XenonPropertyDescriptionImplementation("key", nl.esciencecenter.xenon.XenonPropertyDescription.Type.DOUBLE, java.util.EnumSet.of(Component.XENON), "42.0", "test property"));
    java.util.Map<java.lang.String, java.lang.String> props = new java.util.HashMap<>();
    nl.esciencecenter.xenon.engine.XenonProperties xprop = new nl.esciencecenter.xenon.engine.XenonProperties(valid, props);
    org.junit.Assert.assertTrue(((xprop.getDoubleProperty("key")) == 42.0));
}