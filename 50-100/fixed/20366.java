@java.lang.Override
public void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    if (mIsInitialized) {
        setMatrix();
        android.graphics.Matrix localMatrix1 = new android.graphics.Matrix();
        localMatrix1.postConcat(this.mMatrix);
        canvas.drawBitmap(mBitmap, localMatrix1, mPaintBitmap);
        drawEditFrame(canvas);
    }
}