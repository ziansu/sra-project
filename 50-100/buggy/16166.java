public void loadUrl(java.lang.String url) {
    android.util.Log.d(com.fengshihao.webpager.WebPager.TAG, (("loadUrl() called with: url = [" + url) + "]"));
    if (!(atLastPage())) {
        adapter.cutFrom(getCurrentItem());
    }else {
        adapter.addItem(url);
    }
}