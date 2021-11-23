private void startSearchActivity(int requestCode, int type, java.lang.String address) {
    android.content.Intent searchIntent = new android.content.Intent(this, com.mybus.activity.SearchActivity.class);
    searchIntent.putExtra(SearchActivity.SEARCH_TYPE_EXTRA, type);
    searchIntent.putExtra(SearchActivity.SEARCH_ADDRESS_EXTRA, address);
    startActivityForResult(searchIntent, requestCode);
    overridePendingTransition(0, 0);
}