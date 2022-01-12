public void signInEmail(android.view.View v) {
    setEmail(true);
    if (((mUsername) != null) && ((mPassword) != null)) {
        setLoading(true);
        com.google.firebase.auth.FirebaseAuth.getInstance().signInWithEmailAndPassword(mUsername, mPassword).addOnFailureListener(this).addOnCompleteListener(this);
        mDataListener.onLogin(null);
    }
}