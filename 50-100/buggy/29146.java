@java.lang.Override
public void callback(bacon.john.bitcoinpricewatch.bitcoin.BitcoinCurrencyModel currency, java.lang.Exception error) {
    if (error == null) {
        mCurrency = currency;
        refreshView();
    }else {
        ((android.widget.TextView) (getView().findViewById(R.id.currency_detail))).setText("There was a problem loading data for this currency - please try again later.");
    }
}