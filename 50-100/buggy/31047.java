@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.util.ArrayList<org.ogasimli.manat.model.Currency>> loader, java.util.ArrayList<org.ogasimli.manat.model.Currency> data) {
    mCurrencyList = data;
    if (((mCurrencyList) != null) && ((mCurrencyList.size()) == 44)) {
        android.util.Log.d(LOG_TAG, "Loaded from DB");
        showResultView();
    }else {
        refreshData();
    }
}