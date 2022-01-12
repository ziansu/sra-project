public void bindFund(com.example.dennis.mutualfund.Fund fund) {
    mFund = fund;
    mSpinner.setSelection(mFund.getWeight());
    mTickerTextView.setText(mFund.getTicker().toUpperCase());
    if ((mFund.getStockValue()) != null) {
        mPriceField.setText(mFund.getStockValue().toString());
    }
}