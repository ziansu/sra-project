public void setUpAds() {
    com.amazon.device.ads.AdRegistration.setAppKey(amazon_id);
    amazonAdView = new letshangllc.allfitness.AdLayout(activity, com.amazon.device.ads.AdSize.SIZE_320x50);
    amazonAdView.setListener(this);
    com.amazon.device.ads.AdRegistration.enableTesting(true);
    admobAdView = new letshangllc.allfitness.AdView(activity);
    admobAdView.setAdSize(com.google.android.gms.ads.AdSize.BANNER);
    admobAdView.setAdUnitId(admob_id);
    adViewContainer = ((android.view.ViewGroup) (view.findViewById(R.id.ad_layout)));
    amazonAdEnabled = true;
    adViewContainer.addView(amazonAdView);
    amazonAdView.loadAd(new letshangllc.allfitness.AdTargetingOptions());
}