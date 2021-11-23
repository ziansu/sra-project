@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    mBeerListAdapter.swapCursor(data);
    if ((mPosition) != (android.widget.ListView.INVALID_POSITION)) {
        mBeerListView.smoothScrollToPosition(mPosition);
    }
    loadingMore = false;
    mBeers = "Check out all these awesome beers that I found on this cool new app, BREWSKI.";
}