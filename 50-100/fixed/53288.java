@java.lang.Override
public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int i, android.os.Bundle bundle) {
    java.lang.String sortOrder = (StatContract.StatEntry.COLUMN_DATE) + " DESC";
    android.content.Intent intent = getActivity().getIntent();
    return new android.support.v4.content.CursorLoader(getActivity(), intent.getData(), tom.chinesesuperleague.FetchActivity.FetchFragment.STAT_COLUMNS, null, null, sortOrder);
}