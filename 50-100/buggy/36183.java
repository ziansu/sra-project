@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    findViewById(R.id.ok).setVisibility(View.VISIBLE);
    image = ((android.graphics.Bitmap) (data.getExtras().get("data")));
    selectCropImage();
    setAndOutputTess();
    findViewById(R.id.cropImageView).setVisibility(View.GONE);
}