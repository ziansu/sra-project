@org.junit.Test
public void nullDataNegativeNegativeTest() {
    thrown.expect(java.lang.NullPointerException.class);
    org.opendaylight.restconf.parser.builder.YangInstanceIdentifierDeserializer.create(schemaContext, null);
}