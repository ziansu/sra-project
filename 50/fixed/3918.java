@org.junit.Test
public void testToString() {
    java.lang.String content = "Hello World";
    org.thegalactic.dgraph.Node<java.lang.String> node = new org.thegalactic.dgraph.Node<java.lang.String>(content);
    org.junit.Assert.assertEquals(content, node.toString());
}