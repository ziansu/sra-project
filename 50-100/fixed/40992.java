private void updateViews() {
    mImageView.setVisibility(View.VISIBLE);
    if (((mMediaArrayList) == null) || ((mMediaArrayList.size()) <= 1)) {
        mViewPager.setVisibility(View.GONE);
    }else {
        mViewPager.setVisibility(View.VISIBLE);
        mAdapter.setDataSet(mMediaArrayList);
        syncViewPagerWithMedia();
    }
}