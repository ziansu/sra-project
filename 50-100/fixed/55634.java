public static boolean isValid(java.sql.Timestamp timestamp) {
    if (timestamp == null) {
        return false;
    }
    java.util.Date nonceDate = timestamp;
    long cDate = java.lang.System.currentTimeMillis();
    long nDate = nonceDate.getTime();
    return (cDate - nDate) < ((utilities.CheckDateTime.MAX_TIME_DIFF_MINS) * 60000);
}