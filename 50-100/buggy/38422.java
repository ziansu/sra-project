public void startRefreshOnce() {
    isRefreshing = true;
    upView.clearAnimation();
    upView.setVisibility(com.bwf.yiqizhuangxiu.gui.custom.GONE);
    if ((headerView) != null)
        smoothScroll(android.support.v4.view.ViewCompat.getTranslationY(headerView), 0);
    
    if ((onRefreshListener) != null) {
        postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                onRefreshListener.onRefresh();
            }
        }, 1000);
    }
}