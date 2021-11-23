@java.lang.Override
public void run() {
    if ((containerView) != null) {
        android.graphics.Bitmap bitmap = android.graphics.Bitmap.createBitmap(containerView.getWidth(), containerView.getHeight(), Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
        containerView.draw(canvas);
        this.bitmap = bitmap;
    }
}