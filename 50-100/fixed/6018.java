private void setDefaultPreferences(android.content.Context context) {
    android.preference.PreferenceManager.setDefaultValues(context, R.xml.general, true);
    android.preference.PreferenceManager.setDefaultValues(context, R.xml.help, true);
    android.preference.PreferenceManager.setDefaultValues(context, R.xml.logging, true);
    android.preference.PreferenceManager.setDefaultValues(context, R.xml.notification, true);
    android.preference.PreferenceManager.setDefaultValues(context, R.xml.advanced, true);
    android.preference.PreferenceManager.setDefaultValues(context, R.xml.widget, true);
}