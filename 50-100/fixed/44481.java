public void swapFragment(android.support.v4.app.Fragment fragment, boolean addToBackStack) {
    final android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    ft.replace(R.id.fragment_container, fragment, "primary");
    if (addToBackStack) {
        ft.addToBackStack(null);
    }
    ft.commit();
}