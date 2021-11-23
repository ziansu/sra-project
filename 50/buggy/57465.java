public void done() {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra("imageArray", mImageArray);
    setResult(com.fonsecakarsten.audiobooky.RESULT_OK, intent);
    finish();
}