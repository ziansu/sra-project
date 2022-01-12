private android.graphics.Bitmap initPaints(int size, int center, int radius) {
    android.graphics.Bitmap bitmap = android.graphics.Bitmap.createBitmap(size, size, Bitmap.Config.ALPHA_8);
    android.graphics.Paint eraser = new android.graphics.Paint();
    eraser.setXfermode(new android.graphics.PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
    canvas.drawColor(Color.BLACK);
    canvas.drawCircle(center, center, radius, eraser);
    return bitmap;
}