private int getScrollRange() {
    return ((int) (java.lang.Math.max(0, ((android.util.FloatMath.floor(((mRefreshableView.getContentHeight()) * (mRefreshableView.getScale())))) - (((getHeight()) - (getPaddingBottom())) - (getPaddingTop()))))));
}