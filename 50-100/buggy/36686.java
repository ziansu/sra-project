@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((getCurrentFragment()) instanceof jahirfiquitiva.iconshowcase.fragments.RequestsFragment) {
        getCurrentFragment().onActivityResult(requestCode, resultCode, data);
    }
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.Fragment fragment = fragmentManager.findFragmentByTag("donationsFragment");
    if (fragment != null) {
        fragment.onActivityResult(requestCode, resultCode, data);
    }
}