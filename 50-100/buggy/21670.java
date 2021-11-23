@java.lang.Override
public void onClick(android.view.View view) {
    android.preference.PreferenceScreen pref = ((android.preference.PreferenceScreen) (getPreferenceManager().findPreference(getKey())));
    if ((pref != null) && ((pref.getDialog()) != null)) {
        pref.getDialog().dismiss();
    }else {
        android.content.Intent pluginsPage = new android.content.Intent(getContext(), com.aware.ui.Plugins_Manager.class);
        pluginsPage.setFlags(Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP);
        getContext().startActivity(pluginsPage);
    }
}