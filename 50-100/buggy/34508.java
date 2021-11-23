@java.lang.Override
public void onTourResume(boolean isPaused) {
    tour = social.entourage.android.map.MapTourFragment.newInstance();
    ((social.entourage.android.map.MapTourFragment) (tour)).setIsPaused(isPaused);
    getSupportFragmentManager().beginTransaction().add(R.id.layout_fragment_container, tour).commit();
    if ((fragment) instanceof social.entourage.android.map.MapEntourageFragment) {
        social.entourage.android.map.MapEntourageFragment mapEntourageFragment = ((social.entourage.android.map.MapEntourageFragment) (fragment));
        mapEntourageFragment.enableStartButton(false);
    }
}