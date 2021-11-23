public java.lang.String toJsonString() {
    double avg = ((incomingTransactions) == 0) ? 0 : (serviceTime) / (outgoingTransactions);
    return ((((((((((((("{\"incomingTransactions\":" + (incomingTransactions)) + ",") + "\"incomingTransactionRequestSize\":") + (incomingTransactionRequestSize)) + ",") + "\"incomingTransactionResponseSize\":") + (incomingTransactionResponseSize)) + ",") + "\"incomingTransactionErrors\":") + (incomingTransactionErrors)) + ",") + "\"serviceTime\":") + avg) + "}";
}