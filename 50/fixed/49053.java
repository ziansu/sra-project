public void init(final android.content.Context context) {
    if ((sharedPreferences) == null) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("No context set.");
        }
        sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    }
}