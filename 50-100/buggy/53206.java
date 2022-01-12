public static java.lang.Integer[] getDegreeDistributionUpTo(datastructures.SimpleGraphInterface g, int maxDegreeExclusive) {
    java.lang.Integer[] dgd = new java.lang.Integer[maxDegreeExclusive];
    java.util.Arrays.fill(dgd, 0);
    int degree;
    for (int i = 0; i < (g.getSize()); i++) {
        degree = g.neighborsOf(i).size();
        dgd[degree] = (dgd[degree]) + 1;
    }
    return dgd;
}