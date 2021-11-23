@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    mImageAdapter.swapCursor(((android.database.Cursor) (data)));
    if ((mLastScrollPosition) != (android.widget.GridView.INVALID_POSITION)) {
        android.widget.GridView gridView = ((android.widget.GridView) (getView().findViewById(R.id.main_grid_view)));
        gridView.smoothScrollToPosition(mLastScrollPosition);
    }else
        if (((mTwoPane) == true) && ((mLastScrollPosition) == (android.widget.GridView.INVALID_POSITION))) {
            selectItemFromList(0);
        }
    
}