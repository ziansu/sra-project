@java.lang.Override
public void onDestroyActionMode(android.support.v7.view.ActionMode mode) {
    if ((Build.VERSION.SDK_INT) >= 21) {
        activity.getWindow().setStatusBarColor(android.support.v4.content.ContextCompat.getColor(activity.getApplicationContext(), R.color.colorSecondaryDark));
    }
    adapter.clearSelection();
    activity.setActionMode(null);
}