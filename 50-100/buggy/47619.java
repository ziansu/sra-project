public csc668assignment1.TransactionItem getNextTransItem(java.lang.String transItem) {
    java.lang.String upc = transItem.substring(0, 4);
    int quantity = 1;
    if ((transItem.substring(4)) != null) {
        quantity = java.lang.Integer.parseInt(transItem.substring(9));
    }
    return new csc668assignment1.TransactionItem(upc, quantity);
}