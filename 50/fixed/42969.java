private gitmad.bitter.data.firebase.FirebaseSyncRequester newFirebaseSyncRequesterForComment(java.lang.String commentId) {
    return new gitmad.bitter.data.firebase.FirebaseSyncRequester(newFirebaseRefForComment(commentId));
}