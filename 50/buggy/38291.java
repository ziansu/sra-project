public void clearCache() {
    mDatabaseHelper.clearCachedImages();
    mImageList.removeAll(mImageList);
    notifyDataSetChanged();
}