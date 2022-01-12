private void setDefaultPreferences(android.content.Context context) {
    android.preference.PreferenceManager.setDefaultValues(context, R.xml.general, false);
    android.preference.PreferenceManager.setDefaultValues(context, R.xml.help, false);
    android.preference.PreferenceManager.setDefaultValues(context, R.xml.logging, false);
    android.preference.PreferenceManager.setDefaultValues(context, R.xml.notification, false);
    android.preference.PreferenceManager.setDefaultValues(context, R.xml.advanced, false);
    android.preference.PreferenceManager.setDefaultValues(context, R.xml.widget, false);
}