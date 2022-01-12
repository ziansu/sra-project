@org.junit.Test
public void testDetermineParentsEmpty() {
    java.util.HashMap<java.lang.Integer, core.Node> nodeMap = new java.util.HashMap<>();
    core.Node n1 = new core.Node(1, "A", 1);
    nodeMap.put(1, n1);
    core.GraphReducer.determineParents(nodeMap);
    assertTrue(((nodeMap.get(1).getParents().size()) == 0));
}