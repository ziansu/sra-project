@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int swipeDir) {
    com.android.summer.csula.foodvoter.models.User friend = ((com.android.summer.csula.foodvoter.models.User) (viewHolder.itemView.getTag()));
    android.util.Log.d(com.android.summer.csula.foodvoter.FriendsActivity.TAG, ("swipe friend: " + (friend.toString())));
    foodVoterFirebaseDb.unfriendUser(friend);
    friendsAdapter.removeFriend(friend);
}