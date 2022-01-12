public android.graphics.Rect getRect() {
    mRect.set(mCurX, mCurY, ((mCurX) + (mSlideWidth)), ((mCurY) + (mSlideHeight)));
    return mRect;
}