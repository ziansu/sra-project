protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    android.graphics.Bitmap bp = ((android.graphics.Bitmap) (data.getExtras().get("data")));
    iv.setImageBitmap(bp);
}