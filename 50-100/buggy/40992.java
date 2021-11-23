private void updateViews() {
    mImageView.setVisibility(View.VISIBLE);
    mImageView.setImage(com.davemorrissey.labs.subscaleview.ImageSource.uri(mMedia.getPath()));
    if (((mMediaArrayList) == null) || ((mMediaArrayList.size()) <= 1)) {
        mViewPager.setVisibility(View.GONE);
    }else {
        mViewPager.setVisibility(View.VISIBLE);
        mAdapter.setDataSet(mMediaArrayList);
        syncViewPagerWithMedia();
    }
}