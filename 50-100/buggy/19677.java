@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    getActivity().getMenuInflater().inflate(R.menu.menu_music_player, menu);
    android.view.MenuItem menuItem = menu.findItem(R.id.action_share);
    mShareActionProvider = ((android.support.v7.widget.ShareActionProvider) (android.support.v4.view.MenuItemCompat.getActionProvider(menuItem)));
}