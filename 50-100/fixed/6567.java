public csc668assignment1.Transaction readNextTransaction() {
    if (((_transactions) == null) || (!(_transactions.hasNext())))
        return null;
    else {
        java.lang.String name = _transactions.getName();
        java.lang.String upc = _transactions.getUPC();
        int quantity = _transactions.getQuantity();
        csc668assignment1.Payments.Payment payment = _transactions.getPayment();
        return new csc668assignment1.Transaction(name, upc, quantity, payment);
    }
}