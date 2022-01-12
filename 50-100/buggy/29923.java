@org.testng.annotations.Test
public void testGetStandardizedType() {
    org.testng.Assert.assertEquals(org.gephi.graph.api.AttributeUtils.getStandardizedType(java.lang.Integer.class), java.lang.Integer.class);
    org.testng.Assert.assertEquals(org.gephi.graph.api.AttributeUtils.getStandardizedType(int.class), java.lang.Integer.class);
    org.testng.Assert.assertEquals(org.gephi.graph.api.AttributeUtils.getStandardizedType(java.lang.Integer[].class), int[].class);
}