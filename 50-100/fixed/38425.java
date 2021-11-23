private int getScrollRange() {
    return ((int) (java.lang.Math.max(0, (((float) (java.lang.Math.floor(((mRefreshableView.getContentHeight()) * (mRefreshableView.getScale()))))) - (((getHeight()) - (getPaddingBottom())) - (getPaddingTop()))))));
}