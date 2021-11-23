@java.lang.Override
public void onBackPressed() {
    com.seafile.seadroid2.account.Account account = accountManager.getCurrentAccount();
    if (account == null) {
        com.seafile.seadroid2.ui.activity.Intent i = new com.seafile.seadroid2.ui.activity.Intent(this, com.seafile.seadroid2.ui.activity.BrowserActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }
    super.onBackPressed();
}