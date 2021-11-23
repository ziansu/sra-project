public static byte convert(java.lang.String stringValue) {
    if ((com.google.common.base.Strings.isNullOrEmpty(stringValue)) || (TypeUtils.MISSING_INDICATORS.contains(stringValue))) {
        return 0;
    }else
        if (TypeUtils.TRUE_STRINGS.contains(stringValue)) {
            return 1;
        }else
            if (TypeUtils.FALSE_STRINGS.contains(stringValue)) {
                return 0;
            }else {
                throw new java.lang.IllegalArgumentException((("Attempting to convert non-boolean value " + stringValue) + " to Boolean"));
            }
        
    
}