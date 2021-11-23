public static java.lang.String getTimeStringFromMillis(long millis, android.content.res.Resources r) {
    long use = java.lang.Math.abs(millis);
    int secs = ((int) (use / 1000));
    if ((use % 1000) > 1) {
        secs += 1;
    }
    int mins = secs / 60;
    secs = secs % 60;
    int formatString = (millis >= 0) ? R.string.timer_output : R.string.timer_output_negative;
    return java.lang.String.format(r.getString(formatString), mins, secs);
}