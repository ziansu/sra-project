@java.lang.Override
public void fragmentItemViewDismiss() {
    this.instantiableViewControllerRequestsDismissal(itemViewFragment.instance);
    if ((itemViewFragment) != null) {
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        fm.popBackStackImmediate();
    }
}