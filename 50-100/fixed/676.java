public android.graphics.Bitmap pickPhotoResult(android.content.Intent data, android.widget.ImageView imageView) {
    android.graphics.Bitmap photo = null;
    android.net.Uri targetUri = data.getData();
    try {
        photo = android.graphics.BitmapFactory.decodeStream(mActivity.getContentResolver().openInputStream(targetUri));
    } catch (java.io.FileNotFoundException e) {
        android.util.Log.e(getClass().toString(), e.toString());
    }
    return insertPhoto(photo);
}