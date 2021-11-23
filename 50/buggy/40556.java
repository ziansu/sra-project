public android.graphics.Bitmap getPhotoBitmap(android.content.ContentResolver contentResolver, java.lang.String photoUri) throws java.io.IOException {
    android.graphics.Bitmap photo = MediaStore.Images.Media.getBitmap(contentResolver, android.net.Uri.parse(photoUri));
    return photo;
}