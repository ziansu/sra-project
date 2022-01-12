public com.SpryngPayments.Java.Models.Transaction get(java.lang.String transactionId) throws com.SpryngPayments.Java.Exceptions.RequestException {
    this.http.setRequest(new com.SpryngPayments.Java.Http.Requests.Transaction.GetTransaction(transactionId));
    this.http.send();
    com.SpryngPayments.Java.Models.Transaction transaction = ((com.SpryngPayments.Java.Models.Transaction) (this.http.getDeserializedResponse().getData()));
    return transaction;
}