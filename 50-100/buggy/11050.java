public void onLoaded(com.solid.ad.Ad ad) {
    com.solid.news.util.L.i("getfirst ad  onLoaded");
    com.solid.news.logic.NewsCacheMgr.firstAd = ad;
    this.isLoadADing = false;
    com.solid.news.sdk.NewsSdk.getInstance().getReportListener().sendEvent("news_lista_show_facebook_native_ad", "status", java.lang.Long.valueOf((cached ? 1L : 2L)));
}