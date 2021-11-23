@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    boolean drawerOpen = mDrawerLayout.isDrawerOpen(mNavigationView);
    android.view.MenuItem newGameItem = menu.findItem(R.id.action_new_game);
    if (newGameItem != null) {
        menu.findItem(R.id.action_new_game).setVisible((!drawerOpen));
    }
    return super.onPrepareOptionsMenu(menu);
}