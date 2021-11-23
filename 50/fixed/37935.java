public static void set(java.lang.String row, java.lang.String col, double val) {
    Tuple<java.lang.String, java.lang.String> t = new Tuple<java.lang.String, java.lang.String>(row, col);
    SparseMatrix.mat.put(t, val);
    return ;
}