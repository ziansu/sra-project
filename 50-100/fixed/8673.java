public static java.lang.Boolean parseBoolean(final java.lang.Object o) {
    if (o instanceof java.lang.String) {
        if (o.equals("true")) {
            return java.lang.Boolean.TRUE;
        }else
            if (o.equals("false")) {
                return java.lang.Boolean.FALSE;
            }
        
    }else
        if (o instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) (o));
        }
    
    return null;
}