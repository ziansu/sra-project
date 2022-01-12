private void writeNewUserIfNeeded(final com.google.firebase.auth.FirebaseUser user) {
    mUserReference = UserEntry.sRef.child(getUid());
    mUsersListener = new com.google.firebase.database.ValueEventListener() {
        @java.lang.Override
        public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
            if (!(dataSnapshot.exists())) {
                com.pfariasmunoz.indensales.data.models.IndenUser indenUser = getIndenUser(user);
                mUserReference.setValue(indenUser);
            }
        }

        @java.lang.Override
        public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
        }
    };
    mUserReference.addListenerForSingleValueEvent(mUsersListener);
}