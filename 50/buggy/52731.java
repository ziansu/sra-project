public void onRefresh() {
    switchFragments(com.example.codyhunsberger.bitcoindashboard.TickerFragment.newInstance(getJsonString(getResources().getString(R.string.ticker_api_url))));
}