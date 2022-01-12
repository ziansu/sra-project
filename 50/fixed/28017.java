public java.lang.Double getSubTotal(java.util.ArrayList<softparkmulti.Transaction> transactions) {
    java.lang.Double subTotal = 0.0;
    for (softparkmulti.Transaction t : transactions) {
        subTotal += t.getMaxAmount();
    }
    return subTotal;
}