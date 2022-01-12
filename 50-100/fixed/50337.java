public static fatalcubez.ml.workspace.ExpressionValue transpose(fatalcubez.ml.workspace.ExpressionValue v1) {
    if (v1 instanceof fatalcubez.ml.workspace.ScalarValue) {
        return ((fatalcubez.ml.workspace.ScalarValue) (v1));
    }
    fatalcubez.ml.workspace.MatrixValue mV = ((fatalcubez.ml.workspace.MatrixValue) (v1));
    return new fatalcubez.ml.workspace.MatrixValue(mV.getMatrix().transpose());
}