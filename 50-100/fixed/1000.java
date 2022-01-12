public boolean doesEdgesHaveWeight() {
    if (!(edgesHasWeigth)) {
        for (org.apache.storm.graph.Edge edge : edges.values()) {
            if ((edge.getWeight()) != (-1)) {
                edgesHasWeigth = true;
                return true;
            }
        }
    }
    return edgesHasWeigth;
}