@org.junit.Test
public void testDescriptionOfServicePayment() {
    try {
        model.PaymentDescription description = new model.PaymentDescription(1, 1);
        payment = new model.Payment(service, 1, 1, 0);
        assertEquals(description.getPaymentType(), payment.getDescription().getPaymentType());
        assertEquals(description.getPaymentForm(), payment.getDescription().getPaymentForm());
    } catch (exception.PaymentException e) {
        fail(("Should not throw this exception: " + (e.getMessage())));
    }
}