@org.junit.Test
public void deserializeNullSchemaContextNegativeTest() {
    this.thrown.expect(java.lang.NullPointerException.class);
    org.opendaylight.restconf.parser.builder.YangInstanceIdentifierDeserializer.create(null, "deserializer-test:contA");
}