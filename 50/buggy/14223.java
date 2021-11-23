private static double g(se.kth.scs.partitioning.algorithms.Partition p, se.kth.scs.partitioning.algorithms.Vertex v1, double thetaV1) {
    if (v1.containsPartition(p.getId())) {
        return 0;
    }
    return 1 + (1 - thetaV1);
}