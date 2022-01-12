@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    adapter.User user = dataSnapshot.getValue(adapter.User.class);
    if (!(user.getEmail().contains(com.deaspostudios.devchats.MainActivity.mUserEmail))) {
        if (java.lang.Boolean.valueOf(user.getUser_visible())) {
            fragment.user.onlineUsers.add(user);
        }
    }
}