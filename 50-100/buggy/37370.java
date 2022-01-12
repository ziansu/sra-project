public void showAds() {
    com.rubengees.vocables.utils.PreferenceUtils.setAds(this, true);
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().addKeyword("Vocable").addKeyword("Learning").addKeyword("Game").build();
    adView.loadAd(adRequest);
    adView.setVisibility(View.VISIBLE);
}