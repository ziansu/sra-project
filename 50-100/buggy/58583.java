private data.Cluster getNearestCluster(data.Point p) {
    java.lang.Double distance = null;
    java.lang.Double minimumDist = null;
    data.Cluster nearestCluster = null;
    for (data.Cluster c : clusters) {
        distance = p.distance(c.getCentroid());
        if ((distance < minimumDist) || (minimumDist == null)) {
            minimumDist = distance;
            nearestCluster = c;
        }
    }
    assert nearestCluster != null;
    return nearestCluster;
}