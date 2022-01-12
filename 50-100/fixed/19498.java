private static int getHashForVector(int[][] signatures, int rowsInBand, int actBand, int columnNum) {
    java.util.List<java.lang.Integer> vector = new java.util.LinkedList<java.lang.Integer>();
    for (int i = 0; i < rowsInBand; ++i) {
        vector.add(signatures[(actBand + i)][columnNum]);
    }
    return vector.hashCode();
}