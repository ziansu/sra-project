public void onChildRemoved(com.google.firebase.database.DataSnapshot dataSnapshot) {
    messageCount = ((int) (dataSnapshot.getChildrenCount()));
}