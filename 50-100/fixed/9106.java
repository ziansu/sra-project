@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem mi) {
    switch (mi.getItemId()) {
        case R.id.menu_prf :
            startActivity(new android.content.Intent(this, com.acmetensortoys.ctfwstimer.SettingsActivity.class));
            return true;
        case R.id.menu_about :
            startActivity(new android.content.Intent(this, com.acmetensortoys.ctfwstimer.AboutActivity.class));
            return true;
        default :
            return super.onOptionsItemSelected(mi);
    }
}