private static com.gempukku.lang.Variable validateParameter(int line, java.util.Map<java.lang.String, com.gempukku.lang.Variable> parameters, java.lang.String parameterName, java.lang.String functionName, com.gempukku.lang.Variable.Type expectedType) throws com.gempukku.lang.ExecutionException {
    com.gempukku.lang.Variable var = parameters.get(parameterName);
    if ((var.getType()) != expectedType)
        throw new com.gempukku.lang.ExecutionException(line, (((("Invalid " + parameterName) + " in ") + functionName) + "()"));
    
    return var;
}