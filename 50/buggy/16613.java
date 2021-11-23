@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((!(com.gevkurg.nytimessearch.helper.Helper.isNetworkAvailable(this))) || (!(com.gevkurg.nytimessearch.helper.Helper.isOnline()))) {
        com.gevkurg.nytimessearch.helper.Helper.showSnackBarForInternetConnection(mrvArticles, this);
    }
}