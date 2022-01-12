@java.lang.Override
public void run() {
    mRowsAdapter.clear();
    android.support.v17.leanback.widget.ArrayObjectAdapter adapter = new android.support.v17.leanback.widget.ArrayObjectAdapter(new com.sgottard.tvdemoapp.CardPresenter());
    adapter.addAll(0, MovieList.list);
    android.support.v17.leanback.widget.HeaderItem header = new android.support.v17.leanback.widget.HeaderItem(0, getResources().getString(R.string.search_results));
    mRowsAdapter.add(new android.support.v17.leanback.widget.ListRow(header, adapter));
}