public static boolean isGridded(algorithms.graphs.IGraph graph) {
    for (algorithms.graphs.INode u : graph.getNodes()) {
        if (((u.getLayout().getCenter().getX()) % 1) != 0) {
            return false;
        }
        if (((u.getLayout().getCenter().getY()) % 1) != 0) {
            return false;
        }
    }
    return true;
}