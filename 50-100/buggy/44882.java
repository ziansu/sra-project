@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.mainmenu_share :
            startDiasporaBrowser("/status_messages/new");
            return true;
        case R.id.mainmenu_settings :
            ActivityFinish();
            startActivity(new android.content.Intent(this, com.voidcode.diasporawebclient.SettingsActivity.class));
            return true;
        case R.id.mainmenu_exit :
            this.finish();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}