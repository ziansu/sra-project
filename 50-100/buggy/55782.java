public static java.lang.String formattedTime(com.egr.EGRUtilities.NSTimestamp aTimestamp, java.lang.String formatPattern) {
    if (aTimestamp == null)
        throw new java.lang.IllegalArgumentException("aTimestamp is not allowed to be null");
    
    if ((formatPattern == null) || ((formatPattern.length()) == 0))
        throw new java.lang.IllegalArgumentException("formattedTime :: format is not set correctly");
    
    java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(formatPattern);
    try {
        return formatter.format(aTimestamp);
    } catch (java.lang.NumberFormatException e) {
        com.egr.EGRUtilities.EGRDateUtilities._logger.error("EGRDateUtilities.formattedTime: could not format time because.... \n", e);
        return aTimestamp.toString();
    }
}