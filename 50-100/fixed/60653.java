@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    if (data.moveToFirst()) {
        mViewModel.setLoading(false);
    }else
        if (!(mStockRepo.isLoadDefaultSymbolsEnabled())) {
            mViewModel.setLoading(false);
        }
    
    mRecyclerAdapter.swapCursor(data);
}