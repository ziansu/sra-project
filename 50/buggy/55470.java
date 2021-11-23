public static boolean areEqualDimensions(fatalcubez.ml.workspace.MatrixValue v1, fatalcubez.ml.workspace.MatrixValue v2) {
    return ((v1.getCols()) == (v2.getCols())) || ((v1.getRows()) == (v2.getRows()));
}