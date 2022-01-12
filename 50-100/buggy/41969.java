private double getDistance(fr.bsimo.dijsktra.Vertex node, fr.bsimo.dijsktra.Vertex target) {
    for (fr.bsimo.dijsktra.Edge edge : edges) {
        if ((edge.getSource().equals(node)) && (edge.getDestination().equals(target))) {
            return edge.getWeight();
        }
    }
    throw new java.lang.RuntimeException("Shouldn't happen..");
}