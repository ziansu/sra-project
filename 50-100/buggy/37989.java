@java.lang.Override
public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    mIsLoading = true;
    android.support.v4.content.CursorLoader loader = new android.support.v4.content.CursorLoader(getActivity(), org.tvbrowser.content.TvBrowserContentProvider.CONTENT_URI_DATA_WITH_CHANNEL, org.tvbrowser.tvbrowser.FragmentProgramsList.getProjection(), (((getWhereClause(false)) + (mDayClause)) + (mFilterClause.getWhere())), mFilterClause.getSelectionArgs(), (((((org.tvbrowser.content.TvBrowserContentProvider.DATA_KEY_STARTTIME) + " , ") + (org.tvbrowser.content.TvBrowserContentProvider.CHANNEL_KEY_ORDER_NUMBER)) + " , ") + (org.tvbrowser.content.TvBrowserContentProvider.CHANNEL_KEY_CHANNEL_ID)));
    return loader;
}