public com.SpryngPayments.Java.Models.Transaction get(java.lang.String transactionId) throws com.SpryngPayments.Java.Exceptions.RequestException {
    this.http.setRequest(new com.SpryngPayments.Java.Http.Requests.Transaction.GetTransaction(transactionId));
    this.http.send();
    java.lang.System.out.println(this.http.getResponse());
    com.SpryngPayments.Java.Models.Transaction transaction = ((com.SpryngPayments.Java.Models.Transaction) (this.http.getDeserializedResponse().getData()));
    if (transaction == null) {
        java.lang.System.out.println("It's null though");
    }else {
        java.lang.System.out.println("It is not null!");
    }
    return transaction;
}