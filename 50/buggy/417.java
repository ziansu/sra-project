@java.lang.Override
public boolean onCreateActionMode(android.support.v7.view.ActionMode mode, android.view.Menu menu) {
    mode.getMenuInflater().inflate(R.menu.action_mode, menu);
    mode.setTitle((1 + " items selected"));
    return true;
}