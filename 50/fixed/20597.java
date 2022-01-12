public void requestNewInterstitial() {
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().build();
    mInterstitialAd.loadAd(adRequest);
}