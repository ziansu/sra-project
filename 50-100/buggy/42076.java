public static org.todss.algorithm.path.Path getShortestPath(java.util.List<org.todss.algorithm.path.Path> paths) {
    org.todss.algorithm.path.Path shortest = null;
    for (org.todss.algorithm.path.Path path : paths) {
        if ((shortest == null) || ((path.getCost()) < (shortest.getCost()))) {
            shortest = path;
        }
    }
    return shortest;
}