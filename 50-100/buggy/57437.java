@org.junit.Test(expected = nl.esciencecenter.xenon.InvalidPropertyException.class)
public void testGetDoubleProperty_invalidDefault() throws java.lang.Exception {
    nl.esciencecenter.xenon.engine.util.ImmutableArray<nl.esciencecenter.xenon.XenonPropertyDescription> valid = new nl.esciencecenter.xenon.engine.util.ImmutableArray<nl.esciencecenter.xenon.XenonPropertyDescription>(new nl.esciencecenter.xenon.engine.XenonPropertyDescriptionImplementation("key", nl.esciencecenter.xenon.XenonPropertyDescription.Type.DOUBLE, java.util.EnumSet.of(Component.XENON), "aap", "test property"));
    java.util.Map<java.lang.String, java.lang.String> props = new java.util.HashMap<>();
    new nl.esciencecenter.xenon.engine.XenonProperties(valid, props).getDoubleProperty("key");
}