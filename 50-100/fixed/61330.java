public static void dismissAllDialogs(android.support.v4.app.FragmentManager manager) {
    java.util.List<android.support.v4.app.Fragment> fragments = manager.getFragments();
    if (fragments == null)
        return ;
    
    for (android.support.v4.app.Fragment fragment : fragments) {
        if (fragment == null)
            continue;
        
        if (fragment instanceof android.support.v4.app.DialogFragment) {
            android.support.v4.app.DialogFragment dialogFragment = ((android.support.v4.app.DialogFragment) (fragment));
            dialogFragment.dismissAllowingStateLoss();
        }
        android.support.v4.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        if (childFragmentManager != null)
            eu.forcom.android.publiccore.util.ActivityUtil.dismissAllDialogs(childFragmentManager);
        
    }
}