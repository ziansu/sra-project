public int getIntParameter(final java.lang.String parameterName) {
    assert parameterName != null;
    final java.lang.String value = properties.getProperty(parameterName);
    if (value == null)
        throw new java.lang.IllegalStateException(java.lang.String.format("%s: Parameter '%s' was not found in properties.", SigmaEC.util.Parameters.class.getSimpleName(), parameterName));
    
    return ((int) (evalExpression(dereferenceToValue(value))));
}