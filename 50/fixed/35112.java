@java.lang.Override
public void onVerificationFailed(com.google.firebase.FirebaseException e) {
    android.util.Log.w(TAG, "onVerificationFailed", e);
    if (e instanceof com.google.firebase.auth.FirebaseAuthInvalidCredentialsException) {
    }else
        if (e instanceof com.google.firebase.FirebaseTooManyRequestsException) {
        }
    
}