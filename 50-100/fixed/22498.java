@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((requestCode == (RESULT_OK)) && (data != null)) {
        java.lang.String result = data.getExtras().getString("result");
        mEtText.setText(result);
    }
}