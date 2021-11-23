@java.lang.Override
public void onLoadFinished(android.content.Loader<android.database.Cursor> loader, android.database.Cursor cursor) {
    mMainAdapter.swapCursor(cursor);
    if ((mMainAdapter.getCount()) == 0) {
        mNoResult.setVisibility(View.VISIBLE);
    }else {
        mNoResult.setVisibility(View.INVISIBLE);
    }
}