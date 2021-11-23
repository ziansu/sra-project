private boolean isParameterUndefined(java.lang.String key) {
    return ((java.lang.System.getProperty(key)) == null) && ((context.getInitParameter(key)) == null);
}