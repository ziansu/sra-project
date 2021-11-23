@java.lang.Override
public void setBounds(int left, int top, int right, int bottom) {
    super.setBounds(left, top, right, bottom);
    mHeight = bottom - top;
    mWidth = right - left;
    mWarningTextHeight = -(mWarningTextPaint.getFontMetrics().ascent);
}