@java.lang.Override
public void onClick(android.view.View view) {
    android.preference.PreferenceScreen pref = ((android.preference.PreferenceScreen) (getPreferenceManager().findPreference(getKey())));
    if ((pref != null) && ((pref.getDialog()) != null)) {
        pref.getDialog().dismiss();
    }else {
    }
}