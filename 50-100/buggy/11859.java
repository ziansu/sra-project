public void replaceFragment(android.support.v4.app.Fragment fragment, java.lang.String tag) {
    android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
    android.support.v4.app.FragmentManager.enableDebugLogging(true);
    manager.beginTransaction().setCustomAnimations(R.anim.category_fragment_right_in, R.anim.category_fragment_left_out, R.anim.category_fragment_left_in, R.anim.category_fragment_right_out).hide(getSupportFragmentManager().findFragmentByTag(com.bookstore.main.MainBookListFragment.class.getSimpleName())).addToBackStack(null).add(R.id.container_view, fragment, tag).commit();
}