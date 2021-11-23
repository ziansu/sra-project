public void plotCluster() {
    java.lang.System.out.println((("[Cluster: " + (id)) + "]"));
    java.lang.System.out.println((("[Centroid: " + (centroid)) + "]"));
    java.lang.System.out.println("[Points: \n");
    for (Point p : points) {
        java.lang.System.out.println(p);
    }
    java.lang.System.out.println("]");
}