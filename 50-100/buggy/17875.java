private android.graphics.Bitmap createVideoThumbFromByteArray(java.lang.String baseData) {
    android.graphics.Bitmap bmp = null;
    byte[] data = android.util.Base64.decode(baseData, Base64.DEFAULT);
    if (data != null)
        bmp = android.graphics.BitmapFactory.decodeByteArray(data, 0, data.length);
    
    return bmp;
}