@java.lang.Override
public void onRefreshFinished(boolean success) {
    hideProgressWheel();
    if (success) {
        mAdapter.notifyDataSetChanged();
        if ((mDetailContainer) != null) {
            java.lang.String symbol = getListManipulator().getItem(0).getSymbol();
            android.net.Uri detailUri = com.mcochin.stockstreaks.data.StockContract.StockEntry.buildUri(symbol);
            insertFragmentIntoDetailContainer(detailUri);
        }
    }else {
        if ((getListManipulator().getCount()) == 0) {
            showEmptyWidgets();
        }
    }
    de.greenrobot.event.EventBus.getDefault().removeAllStickyEvents();
}