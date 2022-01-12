private void setDBSaveSummary(java.lang.String saveDate) {
    int key = R.string.pkDBSave;
    android.preference.Preference doDBSave = findPreference(de.aw.monma.preferences.PreferencesAllgemein.prefsArray.get(key));
    java.lang.StringBuilder sb = new java.lang.StringBuilder(getString(R.string.lastSave)).append(": ");
    if (saveDate == null) {
        sb.append(getString(R.string.na));
    }else {
        sb.append(saveDate);
    }
    doDBSave.setSummary(sb.toString());
}