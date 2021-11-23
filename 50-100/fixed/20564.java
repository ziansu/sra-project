public java.lang.String getStringParameter(final java.lang.String parameterName) {
    assert parameterName != null;
    assert !(parameterName.isEmpty());
    final java.lang.String value = properties.getProperty(parameterName);
    if (value == null)
        throw new java.lang.IllegalStateException(java.lang.String.format("%s: Parameter '%s' was not found in properties.", SigmaEC.util.Parameters.class.getSimpleName(), parameterName));
    
    if (SigmaEC.util.Parameters.isReference(value))
        return dereferenceToValue(value);
    
    return value;
}