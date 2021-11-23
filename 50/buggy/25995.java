@java.lang.Override
public void onCancelled(com.firebase.client.FirebaseError firebaseError) {
    android.util.Log.e(getString(R.string.LogTagUserProfile), ((getString(R.string.FirebaseOnCancelledError)) + (firebaseError.getMessage())));
}