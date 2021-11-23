@java.lang.Override
public boolean onPreferenceChange(android.support.v7.preference.Preference preference, java.lang.Object newValue) {
    android.content.SharedPreferences prefs = android.support.v7.preference.PreferenceManager.getDefaultSharedPreferences(getContext());
    android.support.v7.preference.Preference seamlessChapterTransitionsDeleteReadPreference = getPreferenceManager().findPreference("seamless_chapter_transitions_delete_read");
    if (!(prefs.getBoolean("seamless_chapter_transitions", false))) {
        seamlessChapterTransitionsDeleteReadPreference.setEnabled(true);
    }else {
        seamlessChapterTransitionsDeleteReadPreference.setEnabled(false);
        android.content.SharedPreferences.Editor prefEdit = prefs.edit();
        prefEdit.putBoolean("seamless_chapter_transitions_delete_read", false);
        prefEdit.apply();
    }
    return true;
}