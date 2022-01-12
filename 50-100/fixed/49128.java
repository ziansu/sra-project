public java.lang.String getParameterName() {
    java.lang.String paramName = getName();
    if ((paramName.indexOf(IGenericConstants.EXP_SEPARATOR)) != (-1)) {
        paramName = paramName.substring(((paramName.lastIndexOf(IGenericConstants.EXP_SEPARATOR)) + 1));
    }
    return paramName;
}