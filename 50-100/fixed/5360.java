public java.lang.String getParameterName(java.lang.String owner, java.lang.String name, java.lang.String descriptor, int parameterIndex) {
    xyz.papermodloader.book.mapping.MappedMethod method = this.getMethodMapping(owner, name, descriptor);
    if (method != null) {
        java.lang.String[] parameters = method.getParameters();
        if (((parameters != null) && (parameterIndex >= 0)) && (parameterIndex < (parameters.length))) {
            return parameters[parameterIndex];
        }
    }
    return null;
}