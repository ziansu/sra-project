protected void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    if (requestCode == (com.jeffreychan.yutnori.TitleScreenActivity.RC_SIGN_IN)) {
        mSignInClicked = false;
        mResolvingConnectionFailure = false;
        if (resultCode == (RESULT_OK)) {
            client.connect();
        }else {
            android.widget.Toast savedToast = android.widget.Toast.makeText(context, "Unable to sign in to Google", Toast.LENGTH_SHORT);
            savedToast.show();
        }
    }
}