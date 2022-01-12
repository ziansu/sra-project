@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    mHeight = com.angcyo.uiview.github.MeasureSpec.getSize(heightMeasureSpec);
    mWidth = getMeasuredWidth();
    mItemHeight = ((mHeight) - (mPadding)) / (mLetters.size());
    mPosX = (mWidth) - (1.6F * (mTextSize));
}