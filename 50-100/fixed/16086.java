private void initCentroids() {
    kmeans.Point rndPoint;
    java.util.Random rng = new java.util.Random();
    for (int i = 0; i < (clusterCount); i++) {
        clusters[i] = new kmeans.Cluster();
        centroids[i] = new kmeans.Point(data[i]);
    }
}