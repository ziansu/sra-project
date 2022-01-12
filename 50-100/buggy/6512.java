public android.graphics.Bitmap decodePhoto(java.lang.String path) {
    android.net.Uri selectedImageUri = android.net.Uri.parse(selectedImagePath);
    getContentResolver().notifyChange(selectedImageUri, null);
    android.content.ContentResolver cr = getContentResolver();
    android.graphics.Bitmap bitmap = null;
    try {
        bitmap = MediaStore.Images.Media.getBitmap(cr, selectedImageUri);
        android.widget.Toast.makeText(this, selectedImageUri.toString(), Toast.LENGTH_SHORT).show();
    } catch (java.lang.Exception e) {
        android.util.Log.e(nyc.c4q.rosmaryfc.meme_ify_me.MainActivity.logtag, e.toString());
    }
    return bitmap;
}