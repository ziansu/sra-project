@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    android.util.Log.d(LOG_TAG, ("signInWithCredential:onComplete:" + (task.isSuccessful())));
    if (task.isSuccessful()) {
        com.packants.android.Server.PackAntsServer.userName = com.facebook.Profile.getCurrentProfile().getName();
        goToLobbyActivity();
        android.util.Log.i(LOG_TAG, "signInWithCredential", task.getException());
    }
}