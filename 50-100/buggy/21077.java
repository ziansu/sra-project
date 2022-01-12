@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.util.List<com.tarapus.android.friends.Friend>> loader, java.util.List<com.tarapus.android.friends.Friend> friends) {
    mFriends = friends;
    mAdapter.setData(friends);
    if (isResumed()) {
        setListShown(true);
    }else {
        setListShownNoAnimation(true);
    }
}