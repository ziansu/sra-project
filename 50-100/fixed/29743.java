private void createNode(int x, int y) {
    com.goblet.level.FloorNode newNode = new com.goblet.level.FloorNode(x, y, roomParser, true);
    java.lang.System.out.println(nodes);
    for (com.goblet.level.FloorNode node : nodes) {
        if (node.isNeighbourWith(newNode)) {
            node.addNeighbour(newNode);
            newNode.addNeighbour(node);
        }
    }
    nodes.add(newNode);
}