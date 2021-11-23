private void startFilesActivity() {
    com.seafile.seadroid2.ui.activity.Intent intent = new com.seafile.seadroid2.ui.activity.Intent(this, com.seafile.seadroid2.ui.activity.BrowserActivity.class);
    finish();
    startActivity(intent);
}