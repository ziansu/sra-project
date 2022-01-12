@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.menu_camera)) {
        return true;
    }else
        if (id == (R.id.menu_logout)) {
            mShared.edit().putBoolean(getString(R.string.LOGGEDIN), false).commit();
            tcss450.uw.edu.project18.Intent i = new tcss450.uw.edu.project18.Intent(this, tcss450.uw.edu.project18.LoginActivity.class);
            startActivity(i);
            finish();
            return true;
        }
    
    return super.onOptionsItemSelected(item);
}