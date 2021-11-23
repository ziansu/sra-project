public android.graphics.Rect getRect() {
    java.lang.System.out.println(("mCurX==" + (mCurX)));
    mRect.set(mCurX, mCurY, ((mCurX) + (mSlideWidth)), ((mCurY) + (mSlideHeight)));
    return mRect;
}