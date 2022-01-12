private void handleScreenOn() {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("MMMM d, yyyy");
    java.lang.String day = format.format(calendar.getTime());
    mTimeOn = java.lang.System.currentTimeMillis();
    (mNumTimesChecked)++;
    mHelper.updateChecks(day, mNumTimesChecked);
}