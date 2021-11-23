@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    getLikedUsers();
    getBestFriends(likedUsers);
    getInstagramFeed();
}