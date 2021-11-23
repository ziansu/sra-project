@java.lang.Override
public void on(graph.KNode[] kNode) {
    (counter[0])++;
    org.junit.Assert.assertTrue((kNode != null));
    org.junit.Assert.assertTrue(((kNode.length) == 1));
    org.junit.Assert.assertTrue(org.mwdb.utility.PrimitiveHelper.equals("{\"world\":0,\"time\":0,\"id\":1,\"data\": {\"name\": \"MyName\"}}", kNode[0].toString()));
}