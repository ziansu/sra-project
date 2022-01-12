@java.lang.Override
protected void onNewIntent(com.seafile.seadroid2.ui.activity.Intent intent) {
    android.util.Log.d(com.seafile.seadroid2.ui.activity.BrowserActivity.DEBUG_TAG, "onNewIntent");
    java.lang.String server = intent.getStringExtra("server");
    java.lang.String email = intent.getStringExtra("email");
    if ((server == null) || (email == null))
        return ;
    
    com.seafile.seadroid2.account.Account selectedAccount = new com.seafile.seadroid2.account.Account(server, email);
    if (!(account.equals(selectedAccount))) {
        finish();
        startActivity(intent);
    }
}