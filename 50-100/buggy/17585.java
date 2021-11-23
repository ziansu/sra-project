@java.lang.Override
public void onDrawerOpened(android.view.View drawerView) {
    super.onDrawerOpened(drawerView);
    if (!(isAdded())) {
        return ;
    }
    if (!(mUserLearnedDrawer)) {
        mUserLearnedDrawer = true;
        uk.org.crimetalk.utils.PreferenceUtils.setUserLearnedNavigation(getActivity(), true);
    }
    getActivity().invalidateOptionsMenu();
}