@org.junit.Test
public void testValidServicePayment() {
    try {
        payment = new model.Payment(service, 1, 1, 1);
        assertEquals(service, payment.getService());
    } catch (exception.PaymentException e) {
        fail(("Should not throw this exception: " + (e.getMessage())));
    }
}