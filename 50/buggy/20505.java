public android.graphics.Bitmap getImageAsBitMap() {
    return android.graphics.BitmapFactory.decodeByteArray(image, 0, image.length);
}