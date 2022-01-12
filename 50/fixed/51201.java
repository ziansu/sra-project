@java.lang.Override
public void run() {
    bannerAd.setVisibility(View.VISIBLE);
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().build();
    bannerAd.loadAd(adRequest);
}