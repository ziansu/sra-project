private void loadOwnerImage(java.lang.String owner) {
    if ((context) == null)
        return ;
    
    com.google.firebase.database.FirebaseDatabase.getInstance().getReference("users").child(owner).child("userInfo").getRef().addListenerForSingleValueEvent(new com.google.firebase.database.ValueEventListener() {
        @java.lang.Override
        public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
            it.polito.group05.group05.Utility.HelperClasses.ImageUtils.LoadUserImageProfile(cv_owner, context, dataSnapshot.getValue(it.polito.group05.group05.Utility.BaseClasses.UserDatabase.class));
        }

        @java.lang.Override
        public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
        }
    });
}