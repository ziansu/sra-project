private void showAds() {
    mAdView = ((com.google.android.gms.ads.AdView) (rootView.findViewById(R.id.update_information_banner_field)));
    java.lang.String adsTestId = "7CFCF353FBC40363065F03DFAC7D7EE4";
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().addTestDevice(adsTestId).addKeyword("smartphone").addKeyword("tablet").addKeyword("news apps").addKeyword("games").build();
    mAdView.loadAd(adRequest);
}