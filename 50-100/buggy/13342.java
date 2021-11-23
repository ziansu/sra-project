public void addNodes(Node[] nodes, int width, int height) {
    for (Node n : nodes) {
        this.nodes.add(n);
        node_map.put(coordString(n.getX(), n.getY()), n);
    }
    widthBound = width;
    heightBound = height;
}