public void refreshDatabase() {
    mUserRef.addValueEventListener(new com.firebase.client.ValueEventListener() {
        @java.lang.Override
        public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
            Database = dataSnapshot.getValue(java.util.Map.class);
        }

        @java.lang.Override
        public void onCancelled(com.firebase.client.FirebaseError firebaseError) {
        }
    });
}