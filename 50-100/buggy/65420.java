@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    if ((mUser) != null) {
        android.widget.TextView loginInfor = ((android.widget.TextView) (findViewById(R.id.logininfor)));
        loginInfor.setText((("Welcome, " + (mUser.getDisplayName())) + "!"));
        android.util.Log.d(android.content.ContentValues.TAG, ((com.riversidecorps.rebuy.SingleListingActivity.AUTH_IN) + (mUser.getUid())));
    }else {
        android.util.Log.d(android.content.ContentValues.TAG, com.riversidecorps.rebuy.SingleListingActivity.AUTH_OUT);
    }
}