@java.lang.Override
public void onClick(android.view.View v) {
    if (v == (mSignOut)) {
        finish();
        mFirebaseAuth.signOut();
        mIntent = new android.content.Intent(this, com.example.a6sigma.great4ip.LoginActivity.class);
        startActivity(mIntent);
    }
}