@boa.functions.FunctionSpec(name = "getCol", returnType = "array of float", formalParameters = { "array of array of float" , "int" })
public static double[] getCol(final double[][] data, final long col) {
    double[] result = new double[data.length];
    for (int i = 0; i < (result.length); i++) {
        result[i] = data[i][((int) (col))];
    }
    return result;
}