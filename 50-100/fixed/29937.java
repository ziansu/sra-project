@java.lang.Override
public void onClick(android.view.View v) {
    mSPViewer.pictureUriList.remove(mViewPager.getCurrentItem());
    mPicturePagerAdapter.notifyDataSetChanged();
    android.content.Intent data = new android.content.Intent();
    data.putExtra(SPViewer.VIEWER, mSPViewer.pictureUriList);
    setResult(cn.shyman.library.picture.viewer.RESULT_OK, data);
    if ((mSPViewer.pictureUriList.size()) == 0) {
        finish();
    }else {
        onPageSelected(mViewPager.getCurrentItem());
    }
}