public static org.todss.algorithm.path.Path getShortestPath(java.util.List<org.todss.algorithm.path.Path> paths) {
    org.todss.algorithm.path.Path shortest = null;
    for (org.todss.algorithm.path.Path path : paths) {
        if ((shortest == null) || ((java.lang.Math.abs(path.getCost())) < (java.lang.Math.abs(shortest.getCost())))) {
            shortest = path;
        }
    }
    return shortest;
}