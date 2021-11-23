public void signInEmail(android.view.View v) {
    setLoading(true);
    setEmail(true);
    if (((mUsername) != null) && ((mPassword) != null)) {
        com.google.firebase.auth.FirebaseAuth.getInstance().signInWithEmailAndPassword(mUsername, mPassword).addOnFailureListener(this).addOnCompleteListener(this);
        mDataListener.onLogin(null);
    }
}