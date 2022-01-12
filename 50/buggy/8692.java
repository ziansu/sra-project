@java.lang.Override
public void success(com.shopify.buy.model.Payment payment, com.shopify.sample.application.Response response) {
    this.checkout = payment.getCheckout();
    callback.success(checkout, response);
}