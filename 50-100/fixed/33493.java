@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (com.joiaapp.joia.InitialActivity.SIGN_IN_ACTIVITY_REQUEST_CODE)) && (resultCode == (RESULT_OK))) {
        setResult(Activity.RESULT_OK);
        finish();
    }
    if ((requestCode == (com.joiaapp.joia.InitialActivity.REGISTER_ACTIVITY_REQUEST_CODE)) && (resultCode == (RESULT_OK))) {
        setResult(Activity.RESULT_OK);
        finish();
    }
}