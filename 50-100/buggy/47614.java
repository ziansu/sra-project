@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.amycui.medsminder.ui.MainActivity.RC_SIGN_IN)) {
        if (requestCode == (RESULT_OK)) {
            android.widget.Toast.makeText(this, "signed in", Toast.LENGTH_SHORT).show();
        }else
            if (requestCode == (RESULT_CANCELED)) {
                android.widget.Toast.makeText(this, "sign in cancelled!", Toast.LENGTH_SHORT).show();
                finish();
            }
        
    }
}