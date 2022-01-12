public void loadImage(android.app.Activity activity, android.net.Uri uri) {
    setPhoneData(uri);
    final java.io.InputStream imageStream;
    try {
        imageStream = activity.getContentResolver().openInputStream(this.phoneData);
        final android.graphics.Bitmap selectedImage = android.graphics.BitmapFactory.decodeStream(imageStream);
        imageView.setImageBitmap(selectedImage);
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
}