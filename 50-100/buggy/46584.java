@java.lang.Override
public void onDrawOver(android.graphics.Canvas c, android.support.v7.widget.RecyclerView parent, android.support.v7.widget.RecyclerView.State state) {
    if ((mDraggingItemImage) != null) {
        final float left = ((mTranslationX) + (+(mDraggingItemInfo.margins.left))) - (mShadowPadding.left);
        final float top = (mTranslationY) - (mShadowPadding.top);
        c.drawBitmap(mDraggingItemImage, left, top, null);
    }
}