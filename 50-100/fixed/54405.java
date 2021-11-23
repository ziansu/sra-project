public SigmaEC.util.Option<java.lang.String[]> getOptionalStringArrayParameter(final java.lang.String parameterName) {
    assert parameterName != null;
    assert !(parameterName.isEmpty());
    final java.lang.String value = properties.getProperty(parameterName);
    return value == null ? Option.NONE : new SigmaEC.util.Option<java.lang.String[]>(getStringArrayParameter(parameterName));
}