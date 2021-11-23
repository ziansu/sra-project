public static java.sql.Timestamp StringAndroidToTimestamp(java.lang.String s) {
    java.lang.String toConvert = s.substring(0, ((s.length()) - 2));
    java.sql.Timestamp timestamp = null;
    try {
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date parsedDate = dateFormat.parse(toConvert);
        timestamp = new java.sql.Timestamp(parsedDate.getTime());
    } catch (java.lang.Exception e) {
        android.util.Log.d("Exception date = ", e.toString());
    }
    return timestamp;
}