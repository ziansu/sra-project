private void discardOcrResult() {
    com.squareup.picasso.Picasso.with(getApplicationContext()).invalidate(photoFilePath);
    photoFilePath.delete();
    photoDirPath.delete();
    android.content.Intent resultIntent = new android.content.Intent();
    resultIntent.putExtra("save", 0);
    setResult(Activity.RESULT_OK, resultIntent);
    this.finish();
}