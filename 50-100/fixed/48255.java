public static java.util.List<nl.tue.comparison.ComparisonResult> executeComparisonsForPaths(java.util.List<nl.tue.algorithm.pathindex.PathIndex> paths, nl.tue.algorithm.Algorithm method, nl.tue.io.graph.DirectedBackEdgeGraph graph) {
    java.util.List<nl.tue.comparison.ComparisonResult> res = new java.util.ArrayList<>();
    for (nl.tue.algorithm.pathindex.PathIndex path : paths) {
        int estimation = method.query(path.getPathAsIntArray());
        int result = graph.solvePathQuery(path.getPathAsIntArray()).size();
        res.add(new nl.tue.comparison.ComparisonResult(path, result, estimation));
    }
    return res;
}