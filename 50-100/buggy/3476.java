private double getTotalAmountFor(java.util.Date date, double endTotalAmount, java.util.List<de.fau.amos.virtualledger.android.views.shared.transactionList.Transaction> allTransactions) {
    double dayAmount = endTotalAmount;
    for (de.fau.amos.virtualledger.android.views.shared.transactionList.Transaction t : allTransactions) {
        if ((t.booking().getDate().before(date)) || (t.booking().getDate().equals(date))) {
            dayAmount += t.booking().getAmount();
        }
    }
    return dayAmount;
}