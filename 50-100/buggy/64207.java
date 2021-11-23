public android.graphics.Bitmap loadBitmapFromSharedPreferences(java.lang.String key) {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    java.lang.String stringImage = prefs.getString(key, null);
    if (stringImage != null) {
        byte[] image = android.util.Base64.decode(stringImage, Base64.URL_SAFE);
        android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeByteArray(image, 0, image.length);
        return bitmap;
    }
    return null;
}