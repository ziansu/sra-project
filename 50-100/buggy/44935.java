public java.util.List<java.lang.Package> getOptimumRoute() {
    java.lang.Float optimum = java.lang.Float.MAX_VALUE;
    java.util.List<java.lang.Package> optimumList = null;
    for (java.util.Map.Entry<java.util.List<java.lang.Package>, java.lang.Float> entry : routesWithDistance.entrySet()) {
        java.util.List<java.lang.Package> key = entry.getKey();
        java.lang.Float value = entry.getValue();
        if (value < optimum) {
            optimum = value;
            optimumList = key;
        }
    }
    return optimumList;
}