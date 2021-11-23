void updateLastLoadTime() {
    java.util.Calendar cal = java.util.Calendar.getInstance(java.util.TimeZone.getDefault());
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    long time = java.lang.System.currentTimeMillis();
    editor.putLong("lastLoadTime", time);
    editor.commit();
}