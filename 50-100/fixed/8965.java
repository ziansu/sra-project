@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
        com.expixel.binki.Post post = postSnapshot.getValue(com.expixel.binki.Post.class);
        viewHolder.bookName.setText(post.bookName);
        viewHolder.likeCount.setText(java.lang.String.valueOf(post.starCount));
    }
}