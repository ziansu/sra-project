@java.lang.Override
protected void onPostExecute(java.lang.Void ignore) {
    try {
        new com.ilyarudyak.android.portfel.ui.StockDetailActivity.FetchNewsFeed().execute(com.ilyarudyak.android.portfel.api.Config.getCompanyNewsUrl(mSymbol));
    } catch (java.net.MalformedURLException e) {
        e.printStackTrace();
    }
}