public static boolean convert(java.lang.String stringValue) {
    if ((com.google.common.base.Strings.isNullOrEmpty(stringValue)) || (TypeUtils.MISSING_INDICATORS.contains(stringValue))) {
        return ((java.lang.Boolean) (ColumnType.BOOLEAN.getMissingValue()));
    }else
        if (TypeUtils.TRUE_STRINGS.contains(stringValue)) {
            return true;
        }else
            if (TypeUtils.FALSE_STRINGS.contains(stringValue)) {
                return false;
            }else {
                throw new java.lang.IllegalArgumentException((("Attempting to convert non-boolean value " + stringValue) + " to Boolean"));
            }
        
    
}