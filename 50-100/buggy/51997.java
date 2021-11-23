@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(fragmentActivity);
    mUserLearnedDrawer = sp.getBoolean(cn.cbapay.v50.NavigationDrawerFragment.PREF_USER_LEARNED_DRAWER, false);
    if (savedInstanceState != null) {
        mCurrentSelectedPosition = savedInstanceState.getInt(cn.cbapay.v50.NavigationDrawerFragment.STATE_SELECTED_POSITION);
        mFromSavedInstanceState = true;
    }
    selectItem(mCurrentSelectedPosition);
}