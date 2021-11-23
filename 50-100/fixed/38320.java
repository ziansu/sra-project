@java.lang.Override
public void loadPodcastListFragment(boolean animate) {
    activeFragmentId = R.id.nav_podcast;
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    if (animate) {
        ft.setCustomAnimations(R.animator.fade_in_to_right, R.animator.fade_out_to_right);
    }
    ft.replace(R.id.home_screen_main_fragment, new org.kfjc.android.player.fragment.PodcastFragment()).addToBackStack(null).commit();
    setActionBarBackArrow(false);
}