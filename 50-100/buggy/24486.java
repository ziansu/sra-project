private me.aerovulpe.crawler.data.Photo getCurrentPhoto() {
    mCurrentPhotoIndex = mViewPager.getCurrentItem();
    android.database.Cursor cursor = ((me.aerovulpe.crawler.adapters.PhotoViewerAdapter) (mViewPager.getAdapter())).getCursor();
    return cursor.moveToPosition(mCurrentPhotoIndex) ? me.aerovulpe.crawler.fragments.PhotoViewerFragment.photoFromCursor(cursor) : null;
}