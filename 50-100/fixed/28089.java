public double getStandardDeviationNodeDegree(double mean) {
    double averageNodeDegree = 0.0;
    java.util.Set<java.lang.String> keys = nodeTable.keySet();
    for (java.lang.String key : keys) {
        averageNodeDegree += java.lang.Math.pow(((nodeTable.get(key).getNodeDegree()) - mean), 2);
    }
    return java.lang.Math.sqrt((averageNodeDegree / (nodeTable.size())));
}