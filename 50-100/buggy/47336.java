@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.layout_locations);
    startAnimation();
    people_number = ((android.widget.TextView) (findViewById(R.id.textView2)));
    people_detail = ((android.widget.TextView) (findViewById(R.id.textView3)));
    display_people();
    com.google.android.gms.ads.AdView adView = ((com.google.android.gms.ads.AdView) (findViewById(R.id.adView)));
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().addTestDevice(getString(R.string.deviceid)).build();
    adView.loadAd(adRequest);
}