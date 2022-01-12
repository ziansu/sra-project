public int getTcpServerPort() {
    return java.lang.Integer.parseInt(prefs.getString(org.droidplanner.android.utils.prefs.DroidPlannerPrefs.PREF_TCP_SERVER_PORT, org.droidplanner.android.utils.prefs.DroidPlannerPrefs.DEFAULT_TCP_SERVER_PORT).trim());
}