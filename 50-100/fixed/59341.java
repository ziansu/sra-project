protected android.graphics.Bitmap createBarCode(android.util.DisplayMetrics displayMetrics, java.lang.String s, com.google.zxing.BarcodeFormat format, int width, int height) {
    com.google.zxing.MultiFormatWriter writer = new com.google.zxing.MultiFormatWriter();
    try {
        com.google.zxing.common.BitMatrix bitMatrix = writer.encode(s, format, width, height);
        return com.visualstudio.m3l3m01t.myth.MainActivity.MyFragment.toBitmap(displayMetrics, bitMatrix);
    } catch (com.google.zxing.WriterException e) {
        e.printStackTrace();
        return null;
    }
}