@java.lang.Override
public void onDraw(@android.support.annotation.NonNull
android.graphics.Canvas canvas, @android.support.annotation.NonNull
android.graphics.Paint paint) {
    super.onDraw(canvas, paint);
    com.idonans.doodle.DoodleView.resetPaint(paint);
    canvas.drawBitmap(mBitmap, 0.0F, 0.0F, paint);
}