@org.junit.Test
public void testQueryFieldsWithTwoModifiers() {
    Inspector i = new Inspector();
    MockClassA a = new MockClassA();
    java.lang.String output = i.queryFields(a);
    assertTrue(output.contains("volatile"));
    assertTrue(output.contains("public"));
    assertTrue(output.contains("String"));
}