@java.lang.SuppressWarnings(value = "unused")
public void setCircleRadius(int radius) {
    mInnerRadius = radius;
    mRadius = (mInnerRadius) + (com.licrafter.tagview.utils.DipConvertUtils.dip2px(getContext(), 4));
    invalidate();
}