@java.lang.Override
public void onLoadFinished(android.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    mCursor = data;
    mPagerAdapter.notifyDataSetChanged();
    if (((mCursor) != null) && (mCursor.moveToFirst())) {
        mCursor.moveToPosition(currentPosition);
        mPager.setCurrentItem(currentPosition, false);
        android.util.Log.e("TAG", mCursor.getString(com.jdelorenzo.hitthegym.ViewStatsActivity.COL_NAME));
        emptyView.setVisibility(View.GONE);
    }else {
        emptyView.setVisibility(View.VISIBLE);
    }
}