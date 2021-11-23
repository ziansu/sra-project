public static models.TransactionU createTransaction(java.lang.String contextToPay, java.lang.String paymentToPay, java.lang.String paymentExecutionToPay, int userToPayId, int cartToPayId, models.Restaurant restaurantToPay) {
    models.TransactionU transaction = new models.TransactionU(contextToPay, paymentToPay, paymentExecutionToPay, userToPayId, cartToPayId, restaurantToPay);
    transaction.save();
    models.TransactionU.fillItems(transaction);
    return transaction;
}