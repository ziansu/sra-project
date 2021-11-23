public void addFragment(android.support.v4.app.Fragment fragment, boolean animated) {
    android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
    if (animated) {
        fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out, android.R.anim.fade_in, android.R.anim.fade_out);
    }
    fragmentTransaction.replace(R.id.fragment_container, fragment).addToBackStack(fragment.getClass().getSimpleName()).commit();
}