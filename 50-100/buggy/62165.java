@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (com.csm117.digitalbazaar.MainActivity.REQUEST_CODE_LOGIN)) && (resultCode == (android.app.Activity.RESULT_OK))) {
        signOut();
        return ;
    }
    super.onActivityResult(requestCode, resultCode, data);
    mCallbackManager.onActivityResult(requestCode, resultCode, data);
}