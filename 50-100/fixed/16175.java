@java.lang.Override
public void onCompleted(final java.util.ArrayList<com.shephertz.app42.paas.sdk.android.social.Social.Friends> friends) {
    android.util.Log.e(com.deevs.guessit.activities.GameLobbyActivity.TAG, "Friends list request completed.");
    for (com.shephertz.app42.paas.sdk.android.social.Social.Friends friend : friends) {
        android.util.Log.e(com.deevs.guessit.activities.GameLobbyActivity.TAG, ("friend name = " + (friend.getName())));
    }
    mAdapter.refreshFriendData(friends);
}