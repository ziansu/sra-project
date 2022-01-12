@org.junit.Test
public void testPrimitive() {
    com.xqbase.bn.schema.Schema sc = com.xqbase.bn.schema.Schema.parse(schema);
    org.junit.Assert.assertTrue((sc instanceof com.xqbase.bn.schema.PrimitiveSchema));
    org.junit.Assert.assertEquals(type, sc.getType());
    testEquality(schema, sc);
    java.lang.System.out.println(("schema: " + (schema)));
    testToString(sc);
}