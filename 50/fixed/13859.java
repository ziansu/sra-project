private java.lang.Long loadBestTime() {
    java.lang.Long time = sharedPref.getLong("bestTime", 0L);
    return time;
}