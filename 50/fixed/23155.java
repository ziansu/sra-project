public void backToMain(android.view.View view) {
    android.content.Intent result = new android.content.Intent();
    setResult(Activity.RESULT_OK, result);
    finish();
}