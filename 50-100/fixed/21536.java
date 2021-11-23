@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
public static org.neotech.library.retainabletasks.internal.TaskRetainingFragment getInstance(android.support.v4.app.FragmentManager fragmentManager) {
    org.neotech.library.retainabletasks.internal.TaskRetainingFragmentV11 taskFragment = ((org.neotech.library.retainabletasks.internal.TaskRetainingFragmentV11) (fragmentManager.findFragmentByTag(org.neotech.library.retainabletasks.internal.TaskRetainingFragment.FRAGMENT_TAG)));
    if (taskFragment == null) {
        taskFragment = new org.neotech.library.retainabletasks.internal.TaskRetainingFragmentV11();
        fragmentManager.beginTransaction().add(taskFragment, org.neotech.library.retainabletasks.internal.TaskRetainingFragment.FRAGMENT_TAG).commit();
    }
    return taskFragment.logic;
}