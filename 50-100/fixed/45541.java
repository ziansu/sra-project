@org.junit.Test
public void testInstallmentsOfPayment() {
    try {
        payment = new model.Payment(service, 1, 1, 1);
        assertEquals(new java.lang.Integer(1), payment.getInstallments());
    } catch (exception.PaymentException e) {
        fail(("Should not throw this exception: " + (e.getMessage())));
    }
}