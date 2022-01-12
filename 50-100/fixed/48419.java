@java.lang.Override
public void setParagraphStyle(com.hyena.coretext.blocks.CYParagraphStyle style) {
    super.setParagraphStyle(style);
    if (style != null) {
        mPaint.setColor(style.getTextColor());
        this.mWidth = ((int) (mPaint.measureText(chs, start, count)));
        if ((mPaint.getTextSize()) != (style.getTextSize())) {
            mPaint.setTextSize(style.getTextSize());
            this.mHeight.setValue(getTextHeight(mPaint));
        }
    }
}