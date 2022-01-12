@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    if (!(mNavigationDrawerFragment.isDrawerOpen())) {
        getMenuInflater().inflate(R.menu.main, menu);
        com.example.user.encapsulate.MainActivity.mMenu = menu;
        android.view.MenuItem backIcon = menu.findItem(R.id.action_back);
        if (com.example.user.encapsulate.MainActivity.YOrN) {
            backIcon.setVisible(true);
        }else {
            backIcon.setVisible(false);
        }
        restoreActionBar();
        return true;
    }
    return super.onCreateOptionsMenu(menu);
}