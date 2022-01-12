public java.lang.Double getSubTotalMulti(java.util.ArrayList<softparkmulti.TransactionsOut> transactionsOut) {
    java.lang.Double subTotal = 0.0;
    for (softparkmulti.TransactionsOut tOut : transactionsOut) {
        subTotal += tOut.getMaxAmount();
    }
    return subTotal;
}