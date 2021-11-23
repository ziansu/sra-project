public static java.lang.Boolean isDateBetween(com.egr.EGRUtilities.NSTimestamp startTimestamp, com.egr.EGRUtilities.NSTimestamp endTimestamp, com.egr.EGRUtilities.NSTimestamp aTimestamp) {
    return (aTimestamp.after(startTimestamp)) && (aTimestamp.before(endTimestamp));
}