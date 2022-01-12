@java.lang.Override
public void onClick(final android.view.View view) {
    android.graphics.Bitmap canvasImage = ((android.graphics.drawable.BitmapDrawable) (selectedImage.getDrawable())).getBitmap();
    java.io.ByteArrayOutputStream bs = new java.io.ByteArrayOutputStream();
    canvasImage.compress(Bitmap.CompressFormat.JPEG, combis.hackathon.ui.photo.SelectedPhotoFragment.COMPRESS_QUALITY, bs);
    byte[] bytes = bs.toByteArray();
    java.lang.String encodedImage = android.util.Base64.encodeToString(bytes, Base64.DEFAULT);
    android.util.Log.d("Signature", encodedImage);
}