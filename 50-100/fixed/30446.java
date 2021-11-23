public void btnMakeTransfer(android.view.View v, uk.ac.ncl.csc2022.t14.bankingapp.models.Account accountTo, double amount) {
    uk.ac.ncl.csc2022.t14.bankingapp.server.interfaces.ServerInterface transferrer = uk.ac.ncl.csc2022.t14.bankingapp.Utilities.DataStore.sharedInstance().getConnector();
    uk.ac.ncl.csc2022.t14.bankingapp.models.Account accountA = uk.ac.ncl.csc2022.t14.bankingapp.Utilities.DataStore.sharedInstance().getCurrentUser().getAccountForId(uk.ac.ncl.csc2022.t14.bankingapp.activities.TransferActivity.accountFromId);
    transferrer.makeTransfer(accountA, accountTo, amount, ((uk.ac.ncl.csc2022.t14.bankingapp.server.interfaces.TransferDelegate) (this.getActivity())));
}