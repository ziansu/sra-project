@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    mCompleted = dataSnapshot.getChildrenCount();
    dbCurrentUser.child("remaining").addListenerForSingleValueEvent(new com.google.firebase.database.ValueEventListener() {
        @java.lang.Override
        public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
            mRemaining = dataSnapshot.getChildrenCount();
            mTotalGames = (mCompleted) + (mRemaining);
            updateScoreboard();
        }

        @java.lang.Override
        public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
        }
    });
}