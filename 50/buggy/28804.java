public void playInterstitial2(android.view.View v) {
    if (tv.superawesome.sdk.views.SAInterstitialAd.hasAdAvailable(418)) {
        tv.superawesome.sdk.views.SAInterstitialAd.play(418, this);
    }
}