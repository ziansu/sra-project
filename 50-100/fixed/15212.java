@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    android.util.Log.d(com.sarahrobinson.finalyearproject.fragments.FriendsFragmentTabRequests.TAG, "Getting pending friend");
    com.sarahrobinson.finalyearproject.classes.User user = dataSnapshot.getValue(com.sarahrobinson.finalyearproject.classes.User.class);
    userName = user.getName();
    userEmail = user.getEmail();
    userImg = user.getImage();
    inflateFriendRequestListItem(userName, userEmail, userImg);
}