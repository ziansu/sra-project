private int getClosestCentroid(kmeans.Point point) {
    double minValue = java.lang.Double.MAX_VALUE;
    int closestCentroidIndex = 0;
    for (int j = 0; j < (centroids.length); j++) {
        kmeans.Point centroid = centroids[j];
        double actDistance = point.eulerDistanceTo(centroid);
        if (actDistance < minValue) {
            minValue = actDistance;
            closestCentroidIndex = j;
        }
    }
    return closestCentroidIndex;
}