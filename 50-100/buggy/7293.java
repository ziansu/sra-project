public java.lang.String getFormattedDate(java.lang.String str) {
    com.github.TimeParser tp = new com.github.TimeParser();
    long[] time = tp.GetInput(str);
    java.lang.System.out.println(time[0]);
    java.util.Date date0 = new java.util.Date(time[0]);
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
    sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT-4"));
    java.lang.String formattedDate = sdf.format(date0);
    return formattedDate;
}