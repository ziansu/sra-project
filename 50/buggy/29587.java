@java.lang.Override
public boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu) {
    android.view.MenuInflater inflater = mode.getMenuInflater();
    inflater.inflate(R.menu.menu_main, menu);
    return true;
}