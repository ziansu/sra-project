@org.junit.Test
public void testEmptyGGT() {
    java.util.List<java.lang.Integer> examples = new java.util.ArrayList<java.lang.Integer>();
    swqm.examples.simple.GGT ggt = new swqm.examples.simple.GGT(examples);
    try {
        ggt.get();
        org.junit.Assert.fail("Expected exception");
    } catch (java.lang.IllegalArgumentException ie) {
    }
}