private void requestNewInterstitial() {
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().addTestDevice("A086C24BCC40B2F05F919279DED26002").addTestDevice("68F91B8F0F6A121B1D0C30B6B44FC0F1").build();
    interstitialAd.loadAd(adRequest);
}