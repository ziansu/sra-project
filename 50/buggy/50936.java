public double getSubTotalMulti(java.util.ArrayList<softparkmulti.TransactionsOut> transactionsOut) {
    double subTotal = 0;
    for (softparkmulti.TransactionsOut tOut : transactionsOut) {
        subTotal += tOut.getMaxAmount();
    }
    return subTotal;
}