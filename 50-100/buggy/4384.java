@android.support.annotation.Nullable
private static android.app.Fragment findTopmostFragment(android.app.FragmentManager fragmentManager) {
    int backStackEntryCount = fragmentManager.getBackStackEntryCount();
    android.app.Fragment topmostFragment;
    if (backStackEntryCount > 0) {
        java.lang.String fragmentName = fragmentManager.getBackStackEntryAt((backStackEntryCount - 1)).getName();
        topmostFragment = fragmentManager.findFragmentByTag(fragmentName);
    }else {
        topmostFragment = null;
    }
    return topmostFragment;
}