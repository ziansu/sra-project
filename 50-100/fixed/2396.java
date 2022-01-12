public java.lang.String getJavaTypeStringGetter(java.lang.String prefix) {
    if ((mFieldType.equals(StringUtils.INT)) || (mFieldType.equals(StringUtils.BOOLEAN))) {
        return prefix + "Int";
    }else
        if ((mFieldType.equals(StringUtils.LONG)) || (mFieldType.equals(StringUtils.DATE_TIME))) {
            return prefix + "Long";
        }else
            if (mFieldType.equals(StringUtils.DOUBLE)) {
                return prefix + "Double";
            }else {
                return prefix + "String";
            }
        
    
}