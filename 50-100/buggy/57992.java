@java.lang.Override
public void handleRequest(final de.barzahlen.http.requests.HttpRequest httpRequest, final de.barzahlen.http.responses.HttpResponse httpResponse) {
    java.util.Map<java.lang.String, java.lang.String> parameters = httpRequest.getParameters();
    validateRequest(parameters);
    onTransactionExpired("transaction_id", parameters.get("shop_id"), parameters.get("customer_email"), parameters.get("amount"), parameters.get("currency"), parameters.get("order_id"), parameters.get("custom_var_0"), parameters.get("custom_var_1"), parameters.get("custom_var_2"));
}