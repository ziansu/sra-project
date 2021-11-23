public static java.lang.Boolean isDateBetween(java.util.Date startTimestamp, java.util.Date endTimestamp, java.util.Date aTimestamp) {
    return (aTimestamp.after(startTimestamp)) && (aTimestamp.before(endTimestamp));
}