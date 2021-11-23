@java.lang.Override
public void slideTripPanelDown() {
    if ((tripFragment) != null) {
        findViewById(R.id.close_panel_button).setVisibility(View.VISIBLE);
        com.southwest.southwestapp.utils.AnimationGenericUtils.fadeInAnimation(findViewById(R.id.close_panel_button), this);
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(R.anim.fade_in_bottom, R.anim.slide_out_bottom_with_fade_out);
        ft.remove(tripFragment);
        ft.commit();
    }
}