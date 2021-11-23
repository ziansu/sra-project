@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long l) {
    android.database.Cursor cursor = ((android.database.Cursor) (adapterView.getItemAtPosition(position)));
    if (cursor != null) {
        android.net.Uri detailUri = StatContract.StatEntry.buildStatUriWithName(cursor.getString(tom.chinesesuperleague.FetchFragment.COL_STAT_PLAYER));
        java.lang.System.out.println(("FetchFragment intent uri: " + detailUri));
        android.content.Intent intent = new android.content.Intent(getActivity(), tom.chinesesuperleague.DetailStat.class).setData(detailUri);
        startActivity(intent);
    }
}