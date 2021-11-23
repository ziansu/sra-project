@java.lang.Override
public void setRatioOfHeaderHeightToTwoLevelRefresh(float ratio) {
    if ((mRatioOfHeaderHeightToHintTwoLevelRefresh) >= (mRatioOfHeaderHeightToTwoLevelRefresh)) {
        throw new java.lang.RuntimeException(("If RatioOfHeaderHeightToTwoLevelRefresh less than " + ("RatioOfHeaderHeightToHintTwoLevelRefresh, Two level refresh will never be " + "trigger!")));
    }
    mRatioOfHeaderHeightToTwoLevelRefresh = ratio;
    mOffsetToTwoLevelRefresh = ((int) (java.lang.Math.ceil(((mHeaderHeight) * ratio))));
}