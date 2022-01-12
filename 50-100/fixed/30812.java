private graph.Node createNode(graph.Vector p) {
    for (graph.Node n : nodes) {
        if (n.getOrigin().equals(p)) {
            return n;
        }
    }
    nodes.add(new graph.Node(p));
    return nodes.get(((nodes.size()) - 1));
}