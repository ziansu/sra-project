@org.junit.Test
public void testToString() {
    java.lang.String content = "Hello World";
    org.thegalactic.dgraph.Node<java.lang.String> node = new org.thegalactic.dgraph.Node<java.lang.String>(content);
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    org.junit.Assert.assertEquals(content, node.toString());
}