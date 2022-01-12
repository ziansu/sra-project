@java.lang.Override
public void slideTripPanelDown() {
    if ((tripFragment) != null) {
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(R.anim.fade_in_bottom, R.anim.slide_out_bottom_with_fade_out);
        ft.remove(tripFragment);
        ft.commit();
    }
}