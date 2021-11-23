@java.lang.Override
public void onDrawerOpened(android.view.View drawerView) {
    super.onDrawerOpened(drawerView);
    if (!(isAdded())) {
        return ;
    }
    if (!(mUserLearnedDrawer)) {
        mUserLearnedDrawer = true;
        android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
        sp.edit().putBoolean(com.martin.martinthorneprojects.NavigationDrawerFragment.PREF_USER_LEARNED_DRAWER, true).commit();
    }
    getActivity().supportInvalidateOptionsMenu();
}