@java.lang.Override
public void onActivityCreated(android.os.Bundle bundle) {
    super.onActivityCreated(bundle);
    mAdView = ((com.google.android.gms.ads.AdView) (getView().findViewById(R.id.adView)));
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().build();
    mAdView.loadAd(adRequest);
}