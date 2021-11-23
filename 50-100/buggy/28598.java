@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    boolean login = pref.getBoolean("login_state", false);
    if (login) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
    }else {
        getMenuInflater().inflate(R.menu.menu_hiding, menu);
    }
    return true;
}