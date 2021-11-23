@java.lang.Override
public void setHeaderHeight(int height) {
    super.setHeaderHeight(height);
    mOffsetToHintTwoLevelRefresh = ((int) ((mHeaderHeight) * (mRatioOfHeaderHeightToHintTwoLevelRefresh)));
    mOffsetToTwoLevelRefresh = ((int) ((mHeaderHeight) * (mRatioOfHeaderHeightToTwoLevelRefresh)));
}