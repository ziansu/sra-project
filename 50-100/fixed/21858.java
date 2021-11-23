public boolean execute() {
    if (super.getReceiver().hasCashAccount(this.accountName)) {
        Transaction.CashAcct removal = null;
        for (Transaction.CashAcct account : super.getReceiver().getCashAccounts()) {
            if (account.getName().equalsIgnoreCase(this.accountName)) {
                removal = account;
                break;
            }
        }
        super.getReceiver().removeCashAccount(removal);
        return true;
    }
    return false;
}