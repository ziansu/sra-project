public static models.TransactionU createTransaction(com.paypal.base.rest.APIContext contextToPay, com.paypal.api.payments.Payment paymentToPay, com.paypal.api.payments.PaymentExecution paymentExecutionToPay, int userToPayId, int cartToPayId, models.Restaurant restaurantToPay) {
    models.TransactionU transaction = new models.TransactionU(contextToPay, paymentToPay, paymentExecutionToPay, userToPayId, cartToPayId, restaurantToPay);
    transaction.save();
    models.TransactionU.fillItems(transaction);
    return transaction;
}