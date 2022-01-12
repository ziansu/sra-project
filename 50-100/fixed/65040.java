protected void initAdjacenzyMatrix(java.lang.String s) {
    java.lang.String[] app = singleNode(s);
    int i = nomi.indexOf(app[0]);
    int j = nomi.indexOf(app[1]);
    matrix.addElement(i, j, ((byte) (1)));
}