private java.lang.String getValue(int i, int j) {
    if (i == j) {
        return "x";
    }else {
        return getValue(i, j, countMap.get(new context.healthinformatics.graphs.ConnectionSet(codes.get(i), codes.get(j))));
    }
}