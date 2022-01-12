@java.lang.Override
public void onDrawerOpened(android.view.View drawerView) {
    super.onDrawerOpened(drawerView);
    if (!(isAdded())) {
        return ;
    }
    if (actionBar != null)
        actionBar.setTitle("VoteNote");
    
    if (!(mUserLearnedDrawer)) {
        mUserLearnedDrawer = true;
        android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
        sp.edit().putBoolean(de.oerntec.votenote.NavigationDrawer.NavigationDrawerFragment.PREF_USER_LEARNED_DRAWER, true).apply();
    }
    getActivity().invalidateOptionsMenu();
}