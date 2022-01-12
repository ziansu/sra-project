public boolean execute() {
    if (super.getReceiver().hasCashAccount(this.accountName)) {
        Transaction.CashAcct removal = null;
        for (Transaction.CashAcct account : super.getReceiver().getCashAccounts()) {
            if (account.getName().equalsIgnoreCase(this.accountName)) {
                super.getReceiver().removeCashAccount(account);
                return true;
            }
        }
    }
    return false;
}