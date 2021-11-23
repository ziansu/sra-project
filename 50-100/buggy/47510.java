public void removeEdge(Node<?> from, Node<?> to) {
    if (graph.containsKey(from)) {
        if (graph.get(from).contains(to)) {
            graph.get(from).remove(to);
            to.decEdge();
            if ((to.getEdges()) == 0) {
                graph.remove(to);
            }
        }
    }
}