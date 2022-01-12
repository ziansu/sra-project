public void showAds() {
    com.rubengees.vocables.utils.PreferenceUtils.setAds(this, true);
    adView.setVisibility(View.VISIBLE);
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().addKeyword("Vocable").addKeyword("Learning").addKeyword("Game").build();
    adView.loadAd(adRequest);
}