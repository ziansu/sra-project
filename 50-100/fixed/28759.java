public static double euclideanDistance(cern.colt.matrix.impl.SparseDoubleMatrix1D a, cern.colt.matrix.impl.SparseDoubleMatrix1D b) {
    double distance = 0;
    for (int i = 0; i < (a.size()); i++) {
        distance += java.lang.Math.pow(((a.get(i)) - (b.get(i))), 2);
    }
    if (distance == 0) {
        return 0;
    }
    return java.lang.Math.sqrt(distance);
}