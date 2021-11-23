public static void dismissDialogs(android.support.v4.app.FragmentActivity activity) {
    android.support.v4.app.FragmentManager fm = activity.getSupportFragmentManager();
    java.util.List<android.support.v4.app.Fragment> fragments = fm.getFragments();
    if (null != fragments) {
        for (android.support.v4.app.Fragment fragment : fragments) {
            if ((fragment instanceof android.support.v4.app.DialogFragment) && (!(fragment instanceof im.vector.fragments.VectorUnknownDevicesFragment))) {
                ((android.support.v4.app.DialogFragment) (fragment)).dismissAllowingStateLoss();
            }
        }
    }
}