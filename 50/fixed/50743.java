@java.lang.Override
public void onResume() {
    if (isOnCreate) {
        mAdapter.setShouldStartAnimation(false);
        isOnCreate = false;
    }
    getFeeds();
    super.onResume();
}