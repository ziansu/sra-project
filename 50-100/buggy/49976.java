@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    super.onCreateOptionsMenu(menu, inflater);
    menu.clear();
    inflater.inflate(R.menu.detailfragment, menu);
    android.support.v7.widget.ShareActionProvider mShareActionProvider = ((android.support.v7.widget.ShareActionProvider) (android.support.v4.view.MenuItemCompat.getActionProvider(menu.findItem(R.id.action_share))));
    if (mShareActionProvider != null) {
        mShareActionProvider.setShareIntent(createShareForecastIntent());
    }
}