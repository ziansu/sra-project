public double[] getDoubleArrayParameter(final java.lang.String parameterName) {
    final java.lang.String[] doubleStrings = getStringParameter(parameterName).split(SigmaEC.util.Parameters.LIST_DELIMITER);
    final double[] array = new double[doubleStrings.length];
    for (int i = 0; i < (doubleStrings.length); i++)
        array[i] = java.lang.Double.parseDouble(doubleStrings[i]);
    
    return array;
}