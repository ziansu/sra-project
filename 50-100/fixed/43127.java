@org.junit.Test
public void testProperRunningEdgeHashing() {
    final java.util.HashSet<java.lang.Integer> allRuningEdgesHashed = new java.util.HashSet<java.lang.Integer>();
    for (int i = 0; i < 2; i++) {
        final java.util.List<java.lang.Integer> allRunningEdgesList = getAllPossibleRunningEdgeHashcodes();
        allRuningEdgesHashed.addAll(allRunningEdgesList);
        org.junit.Assert.assertEquals(allRunningEdgesList.size(), allRuningEdgesHashed.size());
    }
}