private boolean isThreadTime2(java.lang.String strText) {
    if ((strText.length()) < 36)
        return false;
    
    java.lang.String strLevel = ((java.lang.String) (strText.substring(31, 36)));
    return strLevel.equals("DEBUG") ? true : strLevel.equals("TRACE") ? true : strLevel.equals("INFO ") ? true : strLevel.equals("WARN ") ? true : strLevel.equals("ERROR") ? true : false;
}