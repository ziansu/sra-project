public void openFragment(android.support.v4.app.Fragment fragment) {
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.container, fragment);
    ft.addToBackStack(null);
    ft.commitAllowingStateLoss();
}