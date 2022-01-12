@java.lang.Override
public void draw(android.graphics.Canvas canvas) {
    super.draw(canvas);
    com.hyena.framework.clientlog.LogUtil.v("yangzc", ("drawBitmap: " + ((mBitmap) == null)));
    if (((mBitmap) != null) && (!(mBitmap.isRecycled()))) {
        canvas.drawBitmap(mBitmap, null, getContentRect(), mPaint);
    }else {
        canvas.drawRect(getContentRect(), mPaint);
    }
}