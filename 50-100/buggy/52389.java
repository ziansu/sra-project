void updateLastLoadTime() {
    java.util.Calendar cal = java.util.Calendar.getInstance(java.util.TimeZone.getDefault());
    sharedPreferences = getSharedPreferences("preferences", Activity.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    long time = java.lang.System.currentTimeMillis();
    long refresh = ((long) (java.lang.Math.floor(cal.getTimeInMillis())));
    editor.putLong("lastLoadTime", time);
    editor.commit();
}