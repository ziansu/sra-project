protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (data != null) {
        android.graphics.Bitmap bp = ((android.graphics.Bitmap) (data.getExtras().get("data")));
        iv.setImageBitmap(bp);
    }
}