private java.util.List getCentroids() {
    java.util.List centroids = new java.util.ArrayList(NUM_CLUSTERS);
    for (Cluster cluster : clusters) {
        Point aux = cluster.getCentroid();
        Point point = new Point(aux.getX(), aux.getY());
        centroids.add(point);
    }
    return centroids;
}