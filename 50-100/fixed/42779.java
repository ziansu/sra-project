@android.support.annotation.NonNull
private static gitmad.bitter.data.firebase.FirebaseSyncRequester[] startRequestersForUsers(java.lang.String[] userIds) {
    gitmad.bitter.data.firebase.FirebaseSyncRequester[] userRequesters = new gitmad.bitter.data.firebase.FirebaseSyncRequester[userIds.length];
    for (int i = 0; i < (userIds.length); i++) {
        com.firebase.client.Firebase authorRef = gitmad.bitter.data.firebase.FirebaseUserProvider.newFirebaseRefForUser(userIds[i]);
        gitmad.bitter.data.firebase.FirebaseSyncRequester userRequester = new gitmad.bitter.data.firebase.FirebaseSyncRequester(authorRef);
        userRequesters[i] = userRequester;
    }
    return userRequesters;
}