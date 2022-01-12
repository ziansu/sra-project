@java.lang.Override
public void setHeaderHeight(int height) {
    super.setHeaderHeight(height);
    mOffsetToHintTwoLevelRefresh = ((int) (java.lang.Math.ceil(((mHeaderHeight) * (mRatioOfHeaderHeightToHintTwoLevelRefresh)))));
    mOffsetToTwoLevelRefresh = ((int) (java.lang.Math.ceil(((mHeaderHeight) * (mRatioOfHeaderHeightToTwoLevelRefresh)))));
}