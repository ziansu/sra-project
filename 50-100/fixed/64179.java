@org.junit.Test
public void testValidNullInstallmentsOfPayment() {
    try {
        payment = new model.Payment(service, 1, 1, null);
        assertEquals(new java.lang.Integer(1), payment.getInstallments());
    } catch (exception.PaymentException e) {
        fail(("Should not throw this exception: " + (e.getMessage())));
    }
}