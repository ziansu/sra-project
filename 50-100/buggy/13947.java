@java.lang.Override
protected void onPostExecute(android.database.Cursor cursor) {
    if (cursor != null) {
        mAdapter.setPeopleCursor(cursor);
        mAdapter.notifyDataSetChanged();
        mPeoplePager.setCurrentItem(mResumePosition, false);
    }else {
        android.content.Intent upIntent = android.support.v4.app.NavUtils.getParentActivityIntent(this);
        upIntent.putExtra(LoadActivity.DB_STATUS_EXTRA, false);
        android.support.v4.app.NavUtils.navigateUpTo(this, upIntent);
    }
    mLoad = null;
}