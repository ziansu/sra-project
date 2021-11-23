public void deleteContact(com.example.gvg.contactsfirebase.Contacts contacts) {
    com.google.firebase.database.Query deleteQuery = conDatabaseReference.orderByChild("name").equalTo(contacts.getFriendName());
    deleteQuery.addListenerForSingleValueEvent(new com.google.firebase.database.ValueEventListener() {
        @java.lang.Override
        public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
            for (com.google.firebase.database.DataSnapshot appleSnapshot : dataSnapshot.getChildren()) {
                appleSnapshot.getRef().removeValue();
            }
        }

        @java.lang.Override
        public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
        }
    });
}