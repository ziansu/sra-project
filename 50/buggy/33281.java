@java.lang.Override
public void goBack() {
    android.app.FragmentManager fm = getChildFragmentManager();
    if ((fm.getBackStackEntryCount()) > 1) {
        fm.popBackStack();
    }
}