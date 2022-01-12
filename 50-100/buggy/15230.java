@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
@android.support.annotation.MainThread
public static org.neotech.library.retainabletasks.TaskManager getFragmentTaskManager(@android.support.annotation.NonNull
android.support.v4.app.Fragment fragment) {
    final java.lang.String tag = org.neotech.library.retainabletasks.TaskManager.getTaskManagerTag(fragment.getTag());
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN_MR1)) {
        return org.neotech.library.retainabletasks.TaskManager.getFragmentTaskManagerAPI17(fragment, tag);
    }else {
        return org.neotech.library.retainabletasks.TaskManager.getTaskManager(org.neotech.library.retainabletasks.internal.TaskRetainingFragment.getInstance(fragment.getFragmentManager()), tag);
    }
}