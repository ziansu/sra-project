public static java.lang.String getTimeFromTimestamp(java.lang.String timeStamp) {
    java.lang.String timeAgo = null;
    java.lang.String time = timeStamp.replace("T", " ").replace("+", ".");
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    try {
        java.util.Date timeCreatedDate = dateFormat.parse(time);
        timeAgo = ((java.lang.String) (android.text.format.DateUtils.getRelativeTimeSpanString(timeCreatedDate.getTime(), java.lang.System.currentTimeMillis(), android.text.format.DateUtils.SECOND_IN_MILLIS)));
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    return timeAgo;
}