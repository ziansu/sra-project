private long timeLeft() {
    android.content.SharedPreferences pref = getPreferences(com.lucyeberhard.pillproject1.MODE_PRIVATE);
    long now = new java.util.Date().getTime();
    long d1 = (now - (pref.getLong("-1", 0))) - ((4 * 3600) * 1000);
    long d2 = (now - (pref.getLong("-4", 0))) - ((24 * 3600) * 1000);
    return java.lang.Math.max(0, java.lang.Math.max(d1, d2));
}