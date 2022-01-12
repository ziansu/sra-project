private void setDislikeButton(final java.lang.String post_key) {
    mDatabaseDislike.addValueEventListener(new com.google.firebase.database.ValueEventListener() {
        @java.lang.Override
        public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
            if (dataSnapshot.child(post_key).hasChild(mAuth.getCurrentUser().getUid())) {
                dislikeButton.setImageResource(R.mipmap.red_thumb_down);
            }else {
                dislikeButton.setImageResource(R.mipmap.gray_thumb_down);
            }
        }

        @java.lang.Override
        public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
        }
    });
}