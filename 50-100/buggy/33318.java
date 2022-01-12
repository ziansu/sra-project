public void updateSummaryText(android.content.SharedPreferences sharedPref, java.lang.String key) {
    try {
        updateSummariesSetViaActivities(sharedPref);
        java.lang.String text = sharedPref.getString(key, "");
        findPreference(key).setSummary(text);
    } catch (java.lang.ClassCastException err) {
        java.lang.System.out.println(("IGNORING SUMMARY UPDATE FOR " + key));
    }
}