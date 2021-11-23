@java.lang.Override
public void onDrawerOpened(android.view.View drawerView) {
    super.onDrawerOpened(drawerView);
    parentActivity.supportInvalidateOptionsMenu();
    funnel.logOpen();
    wasClicked = false;
    final android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(parentActivity);
    final boolean knowsToC = prefs.getBoolean(org.wikipedia.settings.PrefKeys.getKnowTocDrawer(), false);
    if (!knowsToC) {
        showToCIntro(prefs, slidingPane, knowToCContainer);
    }
}