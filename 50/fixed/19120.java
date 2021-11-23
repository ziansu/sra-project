@java.lang.Override
public void setRatioOfHeaderHeightToHintTwoLevelRefresh(float ratio) {
    mRatioOfHeaderHeightToHintTwoLevelRefresh = ratio;
    mOffsetToHintTwoLevelRefresh = ((int) ((mHeaderHeight) * ratio));
}