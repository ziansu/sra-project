private java.lang.String getPrettyTime(long timestamp) {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
    return ((sdf.format(new java.util.Date(transactionRecord.getTimestamp()))) + " - ") + (android.text.format.DateUtils.getRelativeTimeSpanString(timestamp).toString());
}