@org.junit.Test
public void deserializeKeysEndsWithComaNegativeTest() {
    this.thrown.expect(java.lang.IllegalArgumentException.class);
    org.opendaylight.restconf.parser.builder.YangInstanceIdentifierDeserializer.create(this.schemaContext, "deserializer-test:list-multiple-keys=value,100,false,");
}