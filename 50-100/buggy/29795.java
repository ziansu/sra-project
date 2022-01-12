@boa.functions.FunctionSpec(name = "getCol", returnType = "array of float", formalParameters = { "array of array of float" , "int" })
public static double[] getCol(final double[][] data, final long col) {
    Jama.Matrix matrix = new Jama.Matrix(data);
    double[] result = new double[matrix.getRowDimension()];
    for (int i = 0; i < (matrix.getColumnDimension()); i++) {
        result[i] = data[i][((int) (col))];
    }
    return result;
}