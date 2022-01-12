public void refreshMonth() {
    uk.ac.ncl.csc2022.t14.bankingapp.activities.AccountActivity.progressLoadTransactions = new android.app.ProgressDialog(getActivity());
    uk.ac.ncl.csc2022.t14.bankingapp.activities.AccountActivity.progressLoadTransactions.setTitle("Loading Transactions");
    uk.ac.ncl.csc2022.t14.bankingapp.activities.AccountActivity.progressLoadTransactions.setMessage("Please wait...");
    uk.ac.ncl.csc2022.t14.bankingapp.activities.AccountActivity.progressLoadTransactions.show();
    uk.ac.ncl.csc2022.t14.bankingapp.server.interfaces.ServerInterface transactionLoader = uk.ac.ncl.csc2022.t14.bankingapp.Utilities.DataStore.sharedInstance().getConnector();
    uk.ac.ncl.csc2022.t14.bankingapp.models.Account account = uk.ac.ncl.csc2022.t14.bankingapp.Utilities.DataStore.sharedInstance().getCurrentUser().getAccountForId(uk.ac.ncl.csc2022.t14.bankingapp.activities.AccountActivity.accountId);
    transactionLoader.loadTransactions(account, uk.ac.ncl.csc2022.t14.bankingapp.activities.AccountActivity.month, uk.ac.ncl.csc2022.t14.bankingapp.activities.AccountActivity.year, ((uk.ac.ncl.csc2022.t14.bankingapp.server.interfaces.TransactionDelegate) (getActivity())));
}