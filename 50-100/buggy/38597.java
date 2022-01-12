@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    java.lang.String key = preference.getKey();
    if ((key.equals(com.team2052.frckrawler.activities.SettingsActivity.EXPORT_PREFERENCE_KEY)) || (key.equals(com.team2052.frckrawler.activities.SettingsActivity.EXPORT_RAW_PREFERENCE_KEY))) {
        new com.team2052.frckrawler.fragments.dialog.PickEventDialogFragment().show(((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportFragmentManager(), "pickEventDialog");
    }
    switch (key) {
        case com.team2052.frckrawler.activities.SettingsActivity.EXPORT_PREFERENCE_KEY :
            clickedPreference = 0;
        case com.team2052.frckrawler.activities.SettingsActivity.EXPORT_RAW_PREFERENCE_KEY :
            clickedPreference = 1;
    }
    return false;
}