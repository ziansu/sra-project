void addNode() {
    for (java.util.ArrayList<java.lang.Double> node : pheromone) {
        node.add(0.0);
    }
    pheromone.add(new java.util.ArrayList<>((++(numNodes))));
    adjList.add(new java.util.ArrayList<>());
    nodes.add(false);
}