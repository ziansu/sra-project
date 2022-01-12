private void replaceFragment(org.kfjc.android.player.fragment.KfjcFragment fragment) {
    getFragmentManager().beginTransaction().replace(R.id.home_screen_main_fragment, fragment, fragment.getFragmentTag()).addToBackStack(null).commit();
    setActionBarBackArrow(fragment.setActionBarBackArrow());
}