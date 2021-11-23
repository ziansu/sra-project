@java.lang.Override
public void onStart() {
    super.onStart();
    auth.addAuthStateListener(authStateListener);
    android.util.Log.d(TAG, "MainActivity onStart: ");
}