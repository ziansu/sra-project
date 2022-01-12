private static int getHashForVector(int[][] signatures, int rowsInBand, int actBand, int columnNum) {
    java.util.List<java.lang.Integer> vector = new java.util.LinkedList<java.lang.Integer>();
    for (int i = actBand; i < rowsInBand; ++i) {
        vector.add(signatures[i][columnNum]);
    }
    return vector.hashCode();
}