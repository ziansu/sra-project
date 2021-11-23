private static org.gnucash.android.model.Money getFormattedAmount(org.gnucash.android.model.Money amount, java.lang.String accountUID, org.gnucash.android.model.TransactionType splitType) {
    boolean isDebitAccount = org.gnucash.android.db.adapter.AccountsDbAdapter.getInstance().getAccountType(accountUID).hasDebitNormalBalance();
    org.gnucash.android.model.Money absAmount = amount.abs();
    boolean isDebitSplit = splitType == (TransactionType.DEBIT);
    if (isDebitAccount) {
        if (isDebitSplit) {
            return absAmount;
        }else {
            return absAmount.negate();
        }
    }else {
        if (isDebitSplit) {
            return absAmount.negate();
        }else {
            return absAmount;
        }
    }
}