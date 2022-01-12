@java.lang.Override
protected void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
    super.onListItemClick(l, v, position, id);
    final android.app.ProgressDialog pd = com.todoroo.andlib.utility.DialogUtilities.progressDialog(this, this.getString(R.string.gtasks_GLA_authenticating));
    pd.show();
    final android.accounts.Account a = accountManager.getAccountByName(nameArray[position]);
    accountName = a.name;
    getAuthToken(a, pd);
}