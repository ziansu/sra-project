public org.bson.Document createPoint(java.lang.Float x, java.lang.Float y, java.lang.Float z, int cluster, int pointKey) {
    org.bson.Document object = new org.bson.Document();
    object.append(Constants.Point.KEY, pointKey);
    object.append(Constants.Point.CLUSTER, cluster);
    java.util.List<java.lang.Float> list = new java.util.ArrayList<>();
    list.add(x);
    list.add(y);
    list.add(z);
    object.append(Constants.Point.VALUE, list);
    return object;
}