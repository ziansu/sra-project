@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    mUserLearnedDrawer = sp.getBoolean(com.dc.cowbird.NavigationDrawerFragment.PREF_USER_LEARNED_DRAWER, false);
    if (savedInstanceState != null) {
        mCurrentSelectedPosition = savedInstanceState.getInt(com.dc.cowbird.NavigationDrawerFragment.STATE_SELECTED_POSITION);
        mFromSavedInstanceState = true;
    }
    selectItem(mCurrentSelectedPosition);
}