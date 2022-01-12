@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.gumgoose.app.netchat.MainActivity.RC_SIGN_IN)) {
        if (resultCode == (RESULT_CANCELED)) {
            finish();
        }
    }
}