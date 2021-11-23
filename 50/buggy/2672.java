private java.lang.String getDate(long time) {
    df.setTimeZone(java.util.TimeZone.getDefault());
    return df.format(new java.util.Date(time));
}