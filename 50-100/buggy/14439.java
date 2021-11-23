@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            if ((accountManager.getCurrentAccount()) == null) {
                com.seafile.seadroid2.ui.activity.Intent intent = new com.seafile.seadroid2.ui.activity.Intent(this, com.seafile.seadroid2.ui.activity.BrowserActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
            this.finish();
        default :
            return super.onOptionsItemSelected(item);
    }
}