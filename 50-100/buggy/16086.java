private void initCentroids() {
    kmeans.Point rndPoint;
    java.util.Random rng = new java.util.Random();
    for (int i = 0; i < (clusterCount); i++) {
        clusters[i] = new kmeans.Cluster();
        kmeans.Point centroidPotentialPoint;
        do {
            rndPoint = data[rng.nextInt(data.length)];
            centroidPotentialPoint = new kmeans.Point(rndPoint.getCoordinates());
            centroids[i] = centroidPotentialPoint;
        } while (isStartingPointFree(centroidPotentialPoint) );
    }
}