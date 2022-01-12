protected void initAds() {
    java.lang.String appKey = getResources().getString(R.string.appodeal_id);
    com.appodeal.ads.Appodeal.confirm(Appodeal.SKIPPABLE_VIDEO);
    com.appodeal.ads.Appodeal.disableNetwork(this, "cheetah");
    com.appodeal.ads.Appodeal.disableNetwork(this, "unity_ads");
    com.appodeal.ads.Appodeal.initialize(this, appKey, (((com.appodeal.ads.Appodeal.BANNER_BOTTOM) | (com.appodeal.ads.Appodeal.INTERSTITIAL)) | (com.appodeal.ads.Appodeal.SKIPPABLE_VIDEO)));
}