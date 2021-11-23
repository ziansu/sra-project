private java.lang.Long loadBestTime() {
    android.content.SharedPreferences sharedPref = getSharedPreferences("Runner", com.runrmby.runner.MODE_PRIVATE);
    java.lang.Long time = sharedPref.getLong("bestTime", 0L);
    return time;
}