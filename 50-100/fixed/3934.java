@org.junit.Test
public void deserializeContainerTest() {
    final java.lang.Iterable<org.opendaylight.yangtools.yang.data.api.YangInstanceIdentifier.PathArgument> result = org.opendaylight.restconf.parser.builder.YangInstanceIdentifierDeserializer.create(this.schemaContext, "deserializer-test:contA");
    org.junit.Assert.assertEquals("Result does not contains expected number of path arguments", 1, com.google.common.collect.Iterables.size(result));
    org.junit.Assert.assertEquals("Not expected path argument", YangInstanceIdentifier.NodeIdentifier.create(org.opendaylight.yangtools.yang.common.QName.create("deserializer:test", "2016-06-06", "contA")), result.iterator().next());
}