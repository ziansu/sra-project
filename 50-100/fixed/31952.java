@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    java.util.Calendar prevDate = com.udacity.stockhawk.data.PrefUtils.getSymbolListLastUpdated(getActivity());
    java.util.Calendar nowDate = java.util.Calendar.getInstance();
    prevDate.add(java.util.Calendar.DAY_OF_MONTH, 7);
    if ((prevDate.compareTo(nowDate)) <= 0) {
        getLoaderManager().initLoader(com.udacity.stockhawk.ui.MainFragment.DOWNLOAD_SYMBOLS_LOADER, null, this);
    }
    getLoaderManager().initLoader(com.udacity.stockhawk.ui.MainFragment.STOCK_LOADER, null, this);
    getLoaderManager().initLoader(com.udacity.stockhawk.ui.MainFragment.AVAIL_SYMBOLS_LOADER, null, this);
    super.onActivityCreated(savedInstanceState);
}