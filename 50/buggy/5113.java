@java.lang.Override
public void onPageSelected(int position) {
    if ((mCursor) != null) {
        mCursor.moveToPosition(position);
    }
    mSelectedItemId = mCursor.getLong(ArticleLoader.Query._ID);
    mCurrentPosition = position;
    updateUpButtonPosition();
}