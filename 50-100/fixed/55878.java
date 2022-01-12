@org.junit.Test
public void testXenonProperties_supportsProperty_useDefault_true() throws java.lang.Exception {
    nl.esciencecenter.xenon.engine.util.ImmutableArray<nl.esciencecenter.xenon.XenonPropertyDescription> valid = new nl.esciencecenter.xenon.engine.util.ImmutableArray<nl.esciencecenter.xenon.XenonPropertyDescription>(new nl.esciencecenter.xenon.engine.XenonPropertyDescriptionImplementation("key", nl.esciencecenter.xenon.XenonPropertyDescription.Type.STRING, java.util.EnumSet.of(Component.XENON), "bla", "test property"));
    java.util.Map<java.lang.String, java.lang.String> props = new java.util.HashMap<>(0);
    nl.esciencecenter.xenon.engine.XenonProperties xprop = new nl.esciencecenter.xenon.engine.XenonProperties(valid, props);
    org.junit.Assert.assertTrue(xprop.supportsProperty("key"));
}