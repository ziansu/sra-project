@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    mUserShownDrawer = sp.getBoolean(com.jvanier.android.sendtocar.controllers.NavigationDrawerFragment.PREF_USER_SHOWN_DRAWER, false);
    if (savedInstanceState != null) {
        mFromSavedInstanceState = true;
    }
}