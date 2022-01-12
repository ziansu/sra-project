@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.util.List<com.tarapus.android.friends.Friend>> loader, java.util.List<com.tarapus.android.friends.Friend> friends) {
    mAdapter.setData(friends);
    mFriends = friends;
    if (isResumed()) {
        setListShown(true);
    }else {
        setListShownNoAnimation(true);
    }
}