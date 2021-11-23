private java.util.List getCentroids() {
    java.util.List centroids = new java.util.ArrayList(NUM_CLUSTERS);
    for (java.lang.Object cluster : clusters) {
        Point aux = ((Cluster) (cluster)).getCentroid();
        Point point = new Point(aux.getX(), aux.getY());
        centroids.add(point);
    }
    return centroids;
}