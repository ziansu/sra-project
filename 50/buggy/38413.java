@java.lang.Override
public boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu) {
    android.util.Log.d(com.bruyu.imagewalker.LimitedGridActivity.TAG, ("try create action mode while inActionMode is " + (java.lang.Boolean.toString(inActionMode))));
    inActionMode = true;
    mode.setTitle("select items");
    return true;
}