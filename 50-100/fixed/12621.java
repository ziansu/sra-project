private finalproject.queryprocessor.clustering.Cluster findClosestCluster(finalproject.WeightedDocument d) {
    finalproject.queryprocessor.clustering.Cluster closest = null;
    java.lang.Double closestDistance = java.lang.Double.MAX_VALUE;
    for (finalproject.queryprocessor.clustering.Cluster cluster : clusterList) {
        java.lang.Double distance = cluster.getCentroid(false).getDistanceFromVector(d.getVector());
        if (distance < closestDistance) {
            closestDistance = distance;
            closest = cluster;
        }
    }
    return closest;
}