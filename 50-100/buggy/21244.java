void buildSubgraph(int maximalPathLength, long subGraphSize) {
    long t0 = java.lang.System.currentTimeMillis();
    BUILD_TO.subgraph = new nl.tue.algorithm.subgraph.estimator.SubgraphEstimator();
    BUILD_TO.subgraph.buildSummary(GRAPH, maximalPathLength, subGraphSize, ((nLabels()) * 2));
    timeSG = nl.tue.algorithm.subgraph_sf.SGA_SF_Builder.toSeconds(t0);
    java.lang.System.out.printf("%30s build in %.1f seconds, and used %.2f%% of %s bytes.%n", BUILD_TO.subgraph.getClass().getSimpleName(), timeSG, ((((double) (BUILD_TO.subgraph.getBytesUsed())) / subGraphSize) * 100), subGraphSize);
}