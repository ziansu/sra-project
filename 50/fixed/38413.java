@java.lang.Override
public boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu) {
    inActionMode = true;
    mode.setTitle("select items");
    return true;
}