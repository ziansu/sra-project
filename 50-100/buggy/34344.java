@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    pl.mirko.models.User currentUser = dataSnapshot.getValue(pl.mirko.models.User.class);
    pl.mirko.models.Comment newComment = new pl.mirko.models.Comment(currentUser.nickname, content, post.postId);
    databaseReference.child(pl.mirko.interactors.FirebaseDatabaseInteractor.COMMENTS).push().setValue(newComment).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener<java.lang.Void>() {
        @java.lang.Override
        public void onComplete(@android.support.annotation.NonNull
        com.google.android.gms.tasks.Task<java.lang.Void> task) {
            basePostSendingListener.onBasePostSendingFinished();
        }
    });
}