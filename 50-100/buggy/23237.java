@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    mUserLearnedDrawer = sp.getBoolean(scip.app.NavigationDrawerFragment.PREF_USER_LEARNED_DRAWER, false);
    if (savedInstanceState != null) {
        mCurrentSelectedPosition = savedInstanceState.getInt(scip.app.NavigationDrawerFragment.STATE_SELECTED_POSITION);
        mFromSavedInstanceState = true;
    }
    selectItem(0);
}