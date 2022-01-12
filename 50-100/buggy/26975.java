private void discardOcrResult() {
    photoFilePath.delete();
    photoDirPath.delete();
    com.squareup.picasso.Picasso.with(getApplicationContext()).invalidate(photoFilePath);
    android.content.Intent resultIntent = new android.content.Intent();
    resultIntent.putExtra("save", 0);
    setResult(Activity.RESULT_OK, resultIntent);
    this.finish();
}