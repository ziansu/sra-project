public static boolean isBlank(java.lang.String value) {
    if (value == null) {
        return true;
    }else
        if ((value.trim().length()) > 1) {
            return false;
        }
    
    return true;
}