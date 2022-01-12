public void plotCluster() {
    java.lang.System.out.println((("[Cluster: " + (id)) + "]"));
    java.lang.System.out.println((("[Centroid: " + (centroid)) + "]"));
    java.lang.System.out.println("[Points: \n");
    for (int i = 0; i < (points.size()); i++) {
        java.lang.System.out.println(points.get(i));
    }
    java.lang.System.out.println("]");
}