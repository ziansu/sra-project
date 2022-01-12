@java.lang.Override
public void setFooterHeight(int height) {
    mFooterHeight = height;
    mOffsetToLoadMore = ((int) ((mRatioOfFooterHeightToLoadMore) * (mFooterHeight)));
}