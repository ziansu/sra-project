public void unfriendUser(final com.android.summer.csula.foodvoter.models.User friend) {
    friendshipRef.child(friend.getId()).removeValue();
}