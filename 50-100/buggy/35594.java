private static boolean numberStringIsValid(java.lang.String s, boolean checkHour) {
    try {
        int numValue = java.lang.Integer.parseInt(s);
        if (((numValue < 0) || (checkHour && (numValue >= 24))) || ((!checkHour) && (numValue >= 59)))
            return false;
        
    } catch (java.lang.NumberFormatException e) {
        return false;
    }
    return true;
}