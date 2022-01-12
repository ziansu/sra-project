protected void initAdjacenzyMatrix(java.lang.String s) {
    java.lang.String[] app = singleNode(s);
    int i = nomi.indexOf(app[0]);
    int j = nomi.indexOf(app[1]);
    java.lang.System.out.println(((i + ",") + j));
    matrix.addElement(i, j, ((byte) (1)));
}