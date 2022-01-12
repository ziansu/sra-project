@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (android.app.Activity.RESULT_CANCELED)) {
        super.onActivityResult(requestCode, resultCode, data);
    }
    switch (requestCode) {
        case org.gnucash.android.ui.account.AccountsActivity.REQUEST_PICK_ACCOUNTS_FILE :
            org.gnucash.android.ui.account.AccountsActivity.importXmlFileFromIntent(this, data);
            break;
        default :
            super.onActivityResult(requestCode, resultCode, data);
            break;
    }
}