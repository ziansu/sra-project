@org.junit.Test
public void testInstallmentsOfPayment() {
    try {
        payment = new model.Payment(service, 1, 1, 0);
        assertEquals(new java.lang.Integer(0), payment.getInstallments());
    } catch (exception.PaymentException e) {
        fail(("Should not throw this exception: " + (e.getMessage())));
    }
}