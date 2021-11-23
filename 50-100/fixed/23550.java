public void getUserFriendsValueEventListener() {
    mRefFriends.addValueEventListener(new com.google.firebase.database.ValueEventListener() {
        @java.lang.Override
        public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
            for (com.google.firebase.database.DataSnapshot child : dataSnapshot.getChildren()) {
                java.lang.String friendName = child.getValue().toString();
                java.lang.String friendID = child.getKey();
                addFriendInformation(friendName, friendID);
            }
        }

        @java.lang.Override
        public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
        }
    });
}