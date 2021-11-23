private void createCentroids() {
    for (Data.Port p : ports) {
        if (p.isActive()) {
            Graph.Node fromCentroid = new Graph.Node(p, true);
            Graph.Node toCentroid = new Graph.Node(p, false);
            fromCentroids.add(fromCentroid);
            nodes.add(fromCentroid);
            nodes.add(toCentroid);
        }
    }
}