@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu_main, menu);
    menu.findItem(R.id.action_toggle).setIcon(R.drawable.ic_action_grid);
    return true;
}