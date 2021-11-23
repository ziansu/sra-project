@org.junit.Test
public void testToolDescriptionLength() {
    org.apache.avro.tool.Main m = new org.apache.avro.tool.Main();
    for (org.apache.avro.tool.Tool t : m.tools.values()) {
        if ((((m.maxLen) + 2) + (t.getShortDescription().length())) > 80) {
            org.junit.Assert.fail(("Tool description too long: " + (t.getName())));
        }
    }
}