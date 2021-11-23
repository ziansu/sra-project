@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    if ((mHasTwoPanes) && (mMusicPlaying)) {
        getActivity().getMenuInflater().inflate(R.menu.menu_top_tracks, menu);
        android.view.MenuItem menuItem = menu.findItem(R.id.action_share);
        menuItem.setVisible(true);
        mShareActionProvider = ((android.support.v7.widget.ShareActionProvider) (android.support.v4.view.MenuItemCompat.getActionProvider(menuItem)));
    }
    super.onCreateOptionsMenu(menu, inflater);
}