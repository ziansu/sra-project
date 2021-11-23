public void clearCache() {
    mDatabaseHelper.clearCachedImages();
    mImageList = new java.util.ArrayList<>();
    notifyDataSetChanged();
}