public void initIMA(java.lang.String adTagURL, android.app.Activity activity) {
    ((android.view.View) (player)).setVisibility(View.INVISIBLE);
    isIMAActive = true;
    if ((player) != null) {
        player.setShouldCancelPlay(true);
    }
    this.adTagURL = adTagURL;
    mActivity = new java.lang.ref.WeakReference(activity);
    if (isPlayerCanPlay) {
        addAdPlayer();
    }
}