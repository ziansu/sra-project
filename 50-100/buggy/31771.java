private void refreshFeed() {
    menu.findItem(R.id.action_refresh).setEnabled(false);
    com.github.sigute.feedloader.fragments.listfragment.FeedFragment fragment = new com.github.sigute.feedloader.fragments.listfragment.FeedFragment();
    android.os.Bundle arguments = new android.os.Bundle();
    arguments.putBoolean(FeedFragment.TABLET_MODE_KEY, tabletMode);
    fragment.setArguments(arguments);
    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_feed_container, fragment).commit();
}