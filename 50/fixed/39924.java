@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    onActivityShareResult(requestCode, resultCode, data);
    super.onActivityResult(requestCode, resultCode, data);
}