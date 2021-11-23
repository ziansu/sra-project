public void changeUserRelation(java.lang.String uid, java.lang.String relation) {
    com.google.firebase.database.DatabaseReference ref = mDbReference.child("users").child(getCurrentUser().getUid()).child("friendList").child(uid);
    ref.removeValue();
    ref.setValue(relation);
}