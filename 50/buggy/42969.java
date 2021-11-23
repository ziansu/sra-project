private gitmad.bitter.data.firebase.FirebaseSyncRequester<gitmad.bitter.model.Comment> newFirebaseSyncRequesterForComment(java.lang.String commentId) {
    return new gitmad.bitter.data.firebase.FirebaseSyncRequester(newFirebaseRefForComment(commentId));
}