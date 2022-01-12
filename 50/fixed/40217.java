public boolean parameterHasMultipleValidValue(java.lang.String param) {
    if (param == null) {
        throw new java.lang.NullPointerException("param");
    }
    return param.matches("\\[(((\\w)*-(\\w)*)*(\\w)*,)*((\\w)*-(\\w)*)*(\\w)*\\]");
}