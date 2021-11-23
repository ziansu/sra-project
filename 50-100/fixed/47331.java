public static void navigateTo(android.support.v4.app.FragmentManager manager, android.support.v4.app.Fragment fragment, int containerId, java.lang.String fragmentTag, boolean addToBackStack, boolean allowCommitStateLoss) {
    android.support.v4.app.FragmentTransaction ft = manager.beginTransaction();
    ft.replace(containerId, fragment, fragmentTag);
    if (addToBackStack) {
        ft.addToBackStack(fragmentTag);
    }
    if (allowCommitStateLoss) {
        ft.commitAllowingStateLoss();
    }else {
        ft.commit();
    }
}