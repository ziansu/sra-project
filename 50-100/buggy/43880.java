@java.lang.Override
public void onBackPressed() {
    android.app.Fragment p = getFragmentManager().findFragmentByTag("settings pref");
    if (p.isVisible()) {
        getFragmentManager().beginTransaction().remove(p).commit();
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setTitle("Socialate");
        findViewById(R.id.entertainmentSpotRecyclerView).setVisibility(View.VISIBLE);
    }else {
        super.onBackPressed();
    }
}