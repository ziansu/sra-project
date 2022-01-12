public void done(com.avos.avoscloud.AVUser user, com.avos.avoscloud.AVException e) {
    if (e == null) {
        progressDialogShow();
        android.util.Log.d("Login", "Login successfully");
        android.widget.Toast.makeText(this, R.string.dialog_text_wait, Toast.LENGTH_SHORT).show();
        android.content.Intent intent = new android.content.Intent(this, com.example.exercise.MainActivity.class);
        startActivity(intent);
        finish();
    }else {
        showLogin(R.string.dialog_message_title, R.string.error_login_failed);
    }
}