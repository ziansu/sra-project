@java.lang.Override
public void onAdFailedToLoad(com.amazon.device.ads.Ad ad, com.amazon.device.ads.AdError adError) {
    if (amazonAdEnabled) {
        amazonAdEnabled = false;
        adViewContainer.removeView(amazonAdView);
        adViewContainer.addView(admobAdView);
    }
    admobAdView.loadAd(new com.google.android.gms.ads.AdRequest.Builder().build());
}