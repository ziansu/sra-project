private java.lang.String getClosestFromSource(java.util.Map<java.lang.String, java.lang.Double> distanceFromSource, java.util.List<java.lang.String> unVisited) {
    java.util.Set<java.lang.String> keys = distanceFromSource.keySet();
    java.lang.Double lowest = java.lang.Double.POSITIVE_INFINITY;
    java.lang.String node = unVisited.get(0);
    for (java.lang.String key : keys) {
        if ((unVisited.contains(key)) && ((distanceFromSource.get(key)) < lowest)) {
            node = key;
            lowest = distanceFromSource.get(key);
        }
    }
    return node;
}