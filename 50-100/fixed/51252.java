@org.junit.Test
public void testDealWithMissing() throws java.lang.Exception {
    java.lang.System.out.println("###### testDealWithMissing...");
    de.cimt.talendcomp.json.JsonDocument doc = new de.cimt.talendcomp.json.JsonDocument("[{\"bo\":{\"person\":[{\"address\":[]}]},\"missing\":\"value\"}]");
    java.lang.String jsonPath = "[0].bo.person[0]";
    com.fasterxml.jackson.databind.JsonNode node = doc.getNode(jsonPath, true);
    org.junit.Assert.assertNotNull(node);
    java.lang.System.out.println(("node: " + node));
    com.fasterxml.jackson.databind.JsonNode missingNode = doc.getNode(node, "missing");
    org.junit.Assert.assertNull(missingNode);
}