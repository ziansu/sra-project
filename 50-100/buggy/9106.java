@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem mi) {
    switch (mi.getItemId()) {
        case R.id.menu_prf :
            startActivity(new android.content.Intent(this, com.acmetensortoys.ctfwstimer.SettingsActivity.class));
            return true;
        case R.id.menu_about :
            startActivity(new android.content.Intent(this, com.acmetensortoys.ctfwstimer.AboutActivity.class));
            return true;
        case R.id.menu_mqtt :
            android.support.v4.app.DialogFragment d = com.acmetensortoys.ctfwstimer.StringSettingDialogFragment.newInstance(R.layout.server_dialog, R.id.server_text, "server", com.acmetensortoys.ctfwstimer.MainActivity.defserver);
            d.show(getSupportFragmentManager(), "serverdialog");
            return true;
        default :
            return super.onOptionsItemSelected(mi);
    }
}