@org.junit.Test
public void testValueOfServicePayment() {
    try {
        payment = new model.Payment(service, 1, 1, 0);
        assertEquals(modelTest.PaymentTest.SERVICE_VALUE, payment.getValue());
    } catch (exception.PaymentException e) {
        fail(("Should not throw this exception: " + (e.getMessage())));
    }
}