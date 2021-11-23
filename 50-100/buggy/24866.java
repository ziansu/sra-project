public static void main(java.lang.String[] args) {
    view.FileSelection f = new view.FileSelection("Select input matrix file", "matrix");
    utility.FileRead.readFile(f.getFile());
    model.Matrix matrix = model.Matrix.getInstance();
    java.lang.System.out.println(matrix);
    matrix.pruneMatrix();
    java.lang.System.out.println(matrix);
    matrix.reconstructMatrix();
    java.lang.System.out.println(matrix);
    model.OrderedHList delta = Main.exploreHMonolithic(matrix.getcM(), matrix.getcN());
}