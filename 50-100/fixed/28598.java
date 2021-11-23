@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    if (pref.getBoolean("login_state", false)) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
    }else {
        getMenuInflater().inflate(R.menu.menu_hiding, menu);
    }
    return true;
}