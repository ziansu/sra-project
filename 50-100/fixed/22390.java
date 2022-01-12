public static android.graphics.Bitmap base64ToBitMap(java.lang.String base64) {
    android.graphics.Bitmap bmp;
    try {
        byte[] data = android.util.Base64.decode(base64, Base64.DEFAULT);
        bmp = android.graphics.BitmapFactory.decodeByteArray(data, 0, data.length);
    } catch (java.lang.IllegalArgumentException e) {
        return android.graphics.BitmapFactory.decodeResource(android.content.res.Resources.getSystem(), R.drawable.sample_0);
    }
    return bmp;
}