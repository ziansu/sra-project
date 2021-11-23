@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    canvas.drawRect(mBarRect, mBarPaint);
    int cX;
    int cY;
    if ((mOrientation) == (com.larswerkman.holocolorpicker.OpacityBar.ORIENTATION_HORIZONTAL)) {
        cX = mBarPointerPosition;
        cY = mBarPointerHaloRadius;
    }else {
        cX = mBarPointerHaloRadius;
        cY = mBarPointerPosition;
    }
    canvas.drawCircle(cX, cY, mBarPointerHaloRadius, mBarPointerHaloPaint);
    canvas.drawCircle(cX, cY, mBarPointerRadius, mBarPointerPaint);
}