@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    switch (resultCode) {
        case com.owncloud.android.ui.activity.ManageAccountsActivity.KEY_DELETE_CODE :
            if (data != null) {
                android.os.Bundle bundle = data.getExtras();
                if (bundle.containsKey(com.owncloud.android.ui.activity.ManageAccountsActivity.KEY_ACCOUNT)) {
                    android.accounts.Account account = org.parceler.Parcels.unwrap(bundle.getParcelable(com.owncloud.android.ui.activity.ManageAccountsActivity.KEY_ACCOUNT));
                    mAccountName = account.name;
                    performAccountRemoval(account);
                }
            }
            break;
    }
}