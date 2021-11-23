public void setImage() {
    try {
        android.graphics.BitmapFactory bitmapFactory = new android.graphics.BitmapFactory();
        bitmapImage = bitmapFactory.decodeStream(getContext().getContentResolver().openInputStream(imageUri));
        editImage.setImageBitmap(bitmapImage);
        android.util.Log.d(getClass().toString(), "setImage success");
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
}