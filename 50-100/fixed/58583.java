private data.Cluster getNearestCluster(data.Point p) {
    java.lang.Double distance = 0.0;
    java.lang.Double minimumDist = 0.0;
    data.Cluster nearestCluster = null;
    for (data.Cluster c : clusters) {
        distance = p.distance(c.getCentroid());
        if ((distance < minimumDist) || (minimumDist == 0.0)) {
            minimumDist = distance;
            nearestCluster = c;
        }
    }
    assert nearestCluster != null;
    return nearestCluster;
}