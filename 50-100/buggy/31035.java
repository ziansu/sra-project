@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long id) {
    java.lang.String currencyName = mCurrencyAdapter.getItem(position);
    double rate;
    if (currencyName == "USD") {
        rate = 1.0;
    }else {
        rate = mConvertRates.get(("USD" + currencyName));
    }
    if ((mProductAdapter) != null) {
        mProductAdapter.setRate(rate);
        mProductAdapter.notifyDataSetChanged();
    }
}