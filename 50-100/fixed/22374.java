public long milliseconds(java.lang.String date) {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
    try {
        java.util.Date mDate = sdf.parse(date.trim());
        long timeInMilliseconds = mDate.getTime();
        return timeInMilliseconds;
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    return 0;
}