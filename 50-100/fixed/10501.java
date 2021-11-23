@java.lang.Override
public void onClick(android.view.View v) {
    if ((mCurrentPage) < (mNumberPages)) {
        mRightButton.setEnabled(false);
        mCurrentPage += 1;
        mImageAdapter.invalidateData();
        mPagerAdapter.notifyDataSetChanged();
        getAllPopularPhotos();
    }else {
        android.widget.Toast.makeText(getBaseContext(), "Already at last page", Toast.LENGTH_SHORT).show();
    }
}