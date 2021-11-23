@java.lang.Override
public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int i, android.os.Bundle bundle) {
    java.lang.String sortOrder = (StatContract.StatEntry.COLUMN_DATE) + " DESC";
    android.net.Uri statForPlayerUri = StatContract.StatEntry.buildStatUriWithName(tom.chinesesuperleague.Roster.getPreferredPlayer(getActivity()));
    return new android.support.v4.content.CursorLoader(getActivity(), statForPlayerUri, tom.chinesesuperleague.FetchFragment.STAT_COLUMNS, null, null, sortOrder);
}