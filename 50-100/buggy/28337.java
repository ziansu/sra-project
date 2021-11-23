java.lang.String convertMillisToHoursMinutesSeconds(long millis) {
    android.util.Log.d("Muunnetaan", java.lang.String.valueOf(millis));
    @android.annotation.SuppressLint(value = "DefaultLocale")
    java.lang.String usageTime = java.lang.String.format("%02d hour, %02d min, %02d sec", java.util.concurrent.TimeUnit.MILLISECONDS.toHours(millis), ((java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(millis)) - (java.util.concurrent.TimeUnit.HOURS.toMinutes(java.util.concurrent.TimeUnit.MILLISECONDS.toHours(millis)))), ((java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(millis)) - (java.util.concurrent.TimeUnit.MINUTES.toSeconds(java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(millis)))));
    android.util.Log.d("Muunnettu", usageTime);
    return usageTime;
}