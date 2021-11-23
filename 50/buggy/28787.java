private void assertList(java.util.List<? extends main.sqlipa.ast.Node> nodes, int size) {
    assertTrue(((nodes.size()) == size));
    for (main.sqlipa.ast.Node node : nodes) {
        assertNotNull(node);
    }
}