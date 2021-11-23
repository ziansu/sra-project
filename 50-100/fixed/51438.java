private static java.lang.Boolean convertToBool(java.lang.String tv, java.lang.String fv, java.lang.String input) {
    if (input.equals(tv)) {
        return true;
    }else
        if (input.equals(fv)) {
            return false;
        }else {
            return null;
        }
    
}