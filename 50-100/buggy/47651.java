@java.lang.Override
public void onActivityCreated(android.os.Bundle bundle) {
    super.onActivityCreated(bundle);
    mAdView = ((com.google.android.gms.ads.AdView) (getView().findViewById(R.id.adView)));
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().addTestDevice("173BD073D90BF3D4470C5BF99574C283").addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
    mAdView.loadAd(adRequest);
}