public void updateBio(java.lang.String bio) {
    com.google.firebase.auth.FirebaseUser firebaseUser = com.google.firebase.auth.FirebaseAuth.getInstance().getCurrentUser();
    if (firebaseUser != null) {
        uk.ac.tees.donut.squad.users.FBUser user = new uk.ac.tees.donut.squad.users.FBUser();
        user.setBio(bio);
        mDatabase.child(firebaseUser.getUid()).setValue(user);
    }else {
        android.widget.Toast.makeText(this, "Something went wrong, please try again.", Toast.LENGTH_SHORT).show();
    }
}