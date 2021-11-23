@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    inflater.inflate(R.menu.menu_share, menu);
    android.view.MenuItem menuItem = menu.findItem(R.id.action_share);
    mShareActionProvider = ((android.support.v7.widget.ShareActionProvider) (android.support.v4.view.MenuItemCompat.getActionProvider(menuItem)));
    mShareActionProvider.setShareIntent(createShareTrackIntent());
    super.onCreateOptionsMenu(menu, inflater);
}