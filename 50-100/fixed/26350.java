@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    showProgress(false);
    com.parse.ParseFacebookUtils.onActivityResult(requestCode, resultCode, data);
    if (resultCode != (android.app.Activity.RESULT_OK))
        return ;
    
    finish();
}