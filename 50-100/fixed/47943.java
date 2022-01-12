@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    android.support.v7.widget.ShareActionProvider shareActionProvider = ((android.support.v7.widget.ShareActionProvider) (android.support.v4.view.MenuItemCompat.getActionProvider(menu.findItem(R.id.action_share))));
    if (shareActionProvider != null) {
        shareActionProvider.setShareIntent(createShareIntent());
    }else {
        android.util.Log.d(app.com.example.android.sunshine.DetailActivityFragment.LOG_TAG, "share action provider is null.");
    }
}