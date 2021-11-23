private me.aerovulpe.crawler.data.Photo getCurrentPhoto() {
    android.database.Cursor cursor = ((me.aerovulpe.crawler.adapters.PhotoViewerAdapter) (mViewPager.getAdapter())).getCursor();
    if (cursor == null)
        return null;
    
    mCurrentPhotoIndex = mViewPager.getCurrentItem();
    return cursor.moveToPosition(mCurrentPhotoIndex) ? me.aerovulpe.crawler.fragments.PhotoViewerFragment.photoFromCursor(cursor) : null;
}