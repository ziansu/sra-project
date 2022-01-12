@java.lang.Override
public gitmad.bitter.model.User getUser(java.lang.String userId) {
    com.firebase.client.Firebase userFirebaseRef = gitmad.bitter.data.firebase.FirebaseUserProvider.newFirebaseRefForUser(userId);
    gitmad.bitter.data.firebase.FirebaseSyncRequester<gitmad.bitter.model.User> userRequester = new gitmad.bitter.data.firebase.FirebaseSyncRequester(userFirebaseRef);
    if (!(userRequester.exists())) {
        throw new java.lang.IllegalArgumentException("User does not exist");
    }
    return userRequester.get();
}