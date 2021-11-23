public java.lang.String[] getStringArrayParameter(final java.lang.String parameterName) {
    assert parameterName != null;
    assert !(parameterName.isEmpty());
    return getStringParameter(parameterName).split(SigmaEC.util.Parameters.LIST_DELIMITER);
}