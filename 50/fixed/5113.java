@java.lang.Override
public void onPageSelected(int position) {
    mCurrentPosition = position;
    if ((mCursor) != null) {
        mCursor.moveToPosition(position);
    }
    mSelectedItemId = mCursor.getLong(ArticleLoader.Query._ID);
    updateUpButtonPosition();
}