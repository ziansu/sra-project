public java.lang.Object processAdd(java.lang.Object[] objects) {
    arr.add(((java.lang.Double) (objects[0])));
    org.wso2.siddhi.debs2017.kmeans.Clusterer cluster = new org.wso2.siddhi.debs2017.kmeans.Clusterer(((java.lang.Integer) (objects[1])), 50, arr);
    cluster.cluster();
    java.util.ArrayList<java.lang.Integer> centers = cluster.getCenterA(arr);
    return centers;
}