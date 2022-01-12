private void showSavedProfilePicture() {
    byte[] array = dbHandler.retrieveByteArrayFromDb();
    android.graphics.Bitmap bitmap = convertByteArrayToBitmap(array);
    if (bitmap == null) {
        profilePic.setImageResource(defaultPic);
    }else {
        profilePic.setImageBitmap(bitmap);
        bitmap.recycle();
    }
}