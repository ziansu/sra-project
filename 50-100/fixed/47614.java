@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.amycui.medsminder.ui.MainActivity.RC_SIGN_IN)) {
        if (requestCode == (RESULT_OK)) {
        }else
            if (requestCode == (RESULT_CANCELED)) {
                finish();
            }
        
    }
}