public android.graphics.Bitmap getHeader() {
    if ((profile) != null) {
        if ((profileBitmap) == null) {
            byte[] image = profilePhoto.getImageData();
            profileBitmap = android.graphics.BitmapFactory.decodeByteArray(image, 0, image.length);
        }
    }
    return profileBitmap;
}