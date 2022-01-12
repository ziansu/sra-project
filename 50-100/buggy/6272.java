public void viewBookOnWeb() {
    if ((mSearchResult) != null) {
        if ((mSearchResult.goodReadsBestBookID) == null) {
        }
        java.lang.String url = jimdandy.mybooklist.Utilities.GoodReadsUtils.buildGoodReadsViewBookOnWebURL(mSearchResult);
        android.net.Uri webPage = android.net.Uri.parse(url);
        android.content.Intent webIntent = new android.content.Intent(android.content.Intent.ACTION_VIEW, webPage);
        if ((webIntent.resolveActivity(getPackageManager())) != null) {
            startActivity(webIntent);
        }
    }
}