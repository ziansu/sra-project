@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.google.firebase.udacity.friendlychat.MainActivity.RC_SIGN_IN)) {
        if (requestCode == (RESULT_OK)) {
            android.widget.Toast.makeText(this, "Signed in!", Toast.LENGTH_SHORT).show();
        }else
            if (requestCode == (RESULT_CANCELED)) {
                android.widget.Toast.makeText(this, "Signed in canceled", Toast.LENGTH_SHORT).show();
                finish();
            }
        
    }
}