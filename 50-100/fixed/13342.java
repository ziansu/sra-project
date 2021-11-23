public void addNodes(Node[] nodes, int width, int height) {
    for (Node n : nodes) {
        this.nodes.add(n);
        node_map.put(coordString(n.x, n.y), n);
    }
    widthBound = width;
    heightBound = height;
}