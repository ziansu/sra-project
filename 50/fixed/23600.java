@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu_main, menu);
    attachLogoutMenuItem(menu);
    return true;
}