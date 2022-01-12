@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    android.util.Log.v(app.amoenus.traktroulette.DetailFragment.LOG_TAG, "in onCreateOptionsMenu");
    inflater.inflate(R.menu.detailfragment, menu);
    android.view.MenuItem menuItem = menu.findItem(R.id.action_share);
    mShareActionProvider = ((android.support.v7.widget.ShareActionProvider) (android.support.v4.view.MenuItemCompat.getActionProvider(menuItem)));
    if ((mForecast) != null) {
        mShareActionProvider.setShareIntent(createShareForecastIntent());
    }
}