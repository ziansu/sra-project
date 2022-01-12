@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.imageViewGoogleSignIn :
            googleSignIn();
            break;
        case R.id.imageViewFacebookSignIn :
            facebookSignIn();
            break;
        case R.id.imageViewTwitterSignIn :
            twitterSignIn();
            break;
        case R.id.guestLoginButton :
            openMainActivity();
            return ;
    }
    progressDialog.show();
}