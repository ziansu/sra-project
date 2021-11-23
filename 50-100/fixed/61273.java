@java.lang.Override
public void slideTripPanelUp() {
    tripFragment = com.southwest.southwestapp.fragments.homepage.TripActionsFragment.newInstance(true);
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.setCustomAnimations(R.anim.fade_in_bottom, R.anim.slide_out_bottom_with_fade_out);
    ft.replace(R.id.panel_container, tripFragment);
    ft.commit();
}