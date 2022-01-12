@org.junit.Test
public void testGetPayments() {
    com.qa.smurf.entities.Payment payment = new com.qa.smurf.entities.Payment("", "", "", "", new com.qa.smurf.entities.Address("", ""), new com.qa.smurf.entities.User());
    java.util.ArrayList<com.qa.smurf.entities.Payment> paymentList = new java.util.ArrayList<com.qa.smurf.entities.Payment>();
    paymentList.add(payment);
    org.mockito.Mockito.when(initialData.getPayment()).thenReturn(paymentList);
    pro.persistPayment(payment);
    assertNotNull(pro.getPayments());
}