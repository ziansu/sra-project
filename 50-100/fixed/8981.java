@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if (!(dataSnapshot.exists())) {
        com.makalaster.adventurefriends.model.User newUser = new com.makalaster.adventurefriends.model.User(currentUser.getUid(), currentUser.getDisplayName(), currentUser.getEmail());
        database.child(currentUser.getUid()).setValue(newUser);
    }
    mUserHolder.LoadCurrentUser(currentUser.getUid());
}