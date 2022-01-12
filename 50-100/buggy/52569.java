@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.gumgoose.app.netchat.MainActivity.RC_SIGN_IN)) {
        if (resultCode == (RESULT_OK)) {
            android.widget.Toast.makeText(this, R.string.toast_signed_in, Toast.LENGTH_SHORT).show();
        }else
            if (resultCode == (RESULT_CANCELED)) {
                finish();
            }
        
    }
}