public long milliseconds(java.lang.String date) {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
    try {
        java.util.Date mDate = sdf.parse(date.trim());
        android.util.Log.w("current", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        long timeInMilliseconds = mDate.getTime();
        android.util.Log.w("test", java.lang.String.valueOf(timeInMilliseconds));
        return timeInMilliseconds;
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    return 0;
}