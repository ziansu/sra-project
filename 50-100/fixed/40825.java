public void removeFriend(final com.gatech.objectsanddesign.shoppingwithfriends.User friend, final android.content.Context context) {
    ref.child(curID).child("friends").child(friend.getUid()).removeValue();
    ref.child(friend.getUid()).child("friends").child(curID).removeValue();
    android.widget.Toast.makeText(context, ("You are no longer friends with " + (friend.toString())), Toast.LENGTH_SHORT).show();
}