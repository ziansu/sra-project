public void setImage() {
    try {
        android.graphics.BitmapFactory bitmapFactory = new android.graphics.BitmapFactory();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inJustDecodeBounds = false;
        options.inSampleSize = 2;
        bitmapImage = bitmapFactory.decodeStream(getContext().getContentResolver().openInputStream(imageUri), null, options);
        editImage.setImageBitmap(bitmapImage);
        android.util.Log.d(getClass().toString(), "setImage success");
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
}