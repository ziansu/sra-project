@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    if (!(mNavigationDrawerFragment.isDrawerOpen())) {
        getMenuInflater().inflate(R.menu.main, menu);
        com.example.user.encapsulate.MainActivity.mMenu = menu;
        restoreActionBar();
        return true;
    }
    return super.onCreateOptionsMenu(menu);
}