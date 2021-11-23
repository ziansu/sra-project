@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    boolean drawerOpen = mDrawerLayout.isDrawerOpen(mNavigationView);
    android.view.MenuItem newGameItem = menu.findItem(R.id.action_new_game);
    android.view.MenuItem timerItem = menu.findItem(R.id.action_timer);
    if ((newGameItem != null) && (timerItem != null)) {
        menu.findItem(R.id.action_new_game).setVisible((!drawerOpen));
    }
    return super.onPrepareOptionsMenu(menu);
}