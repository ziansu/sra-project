private java.lang.String getJavaParcelMethodGenerator(java.lang.String prefix) {
    if ((mFieldType.equals(StringUtils.INT)) || (mFieldType.equals(StringUtils.BOOLEAN))) {
        return prefix + "Int";
    }else
        if (mFieldType.equals(StringUtils.LONG)) {
            return prefix + "Long";
        }else
            if ((mFieldName.equals(StringUtils.DOUBLE)) || (mFieldType.equals(StringUtils.DATE_TIME))) {
                return prefix + "Double";
            }else {
                return prefix + "String";
            }
        
    
}