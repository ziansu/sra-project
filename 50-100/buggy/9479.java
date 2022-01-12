private void createAccountsAndFinish() {
    org.gnucash.android.ui.account.AccountsActivity.removeFirstRunFlag();
    if (mAccountOptions.equals(getString(R.string.wizard_option_create_default_accounts))) {
        java.lang.String bookUID = org.gnucash.android.db.adapter.BooksDbAdapter.getInstance().getActiveBookUID();
        org.gnucash.android.ui.account.AccountsActivity.createDefaultAccounts(mCurrencyCode, this);
        org.gnucash.android.db.adapter.BooksDbAdapter.getInstance().deleteBook(bookUID);
        finish();
    }else
        if (mAccountOptions.equals(getString(R.string.wizard_option_import_my_accounts))) {
            org.gnucash.android.ui.account.AccountsActivity.startXmlFileChooser(this);
        }else {
            finish();
        }
    
}