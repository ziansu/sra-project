@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    mSignInClicked = false;
    if (mFirstTimeSignIn) {
        mFirstTimeSignIn = false;
        android.widget.Toast.makeText(this, ("Connected to " + (getEmail())), Toast.LENGTH_LONG).show();
    }
}