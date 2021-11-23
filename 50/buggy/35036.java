@java.lang.Override
public void recycle() {
    if (!(mContentBitmap.isRecycled())) {
        mContentBitmap.recycle();
    }
    super.recycle();
}