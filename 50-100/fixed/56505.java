@android.support.annotation.Nullable
private me.lazerka.mf.android.adapter.FriendInfo authorizeRequestFrom(@android.support.annotation.Nullable
java.lang.String requesterEmail) {
    me.lazerka.mf.android.adapter.FriendsLoader friendsLoader = new me.lazerka.mf.android.adapter.FriendsLoader(context);
    java.util.List<me.lazerka.mf.android.adapter.FriendInfo> friendInfos = friendsLoader.loadInBackground();
    me.lazerka.mf.android.adapter.FriendInfo friend = null;
    for (me.lazerka.mf.android.adapter.FriendInfo friendInfo : friendInfos) {
        if (friendInfo.emails.contains(requesterEmail)) {
            friend = friendInfo;
            break;
        }
    }
    return friend;
}