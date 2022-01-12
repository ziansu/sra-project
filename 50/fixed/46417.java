private synchronized void reset() {
    prefs.edit().clear().apply();
}