@org.junit.Test
public void testGetTransactionWithNullArgument() throws java.lang.Exception {
    se.fermitet.invest.domain.Transaction answer = presenter.getTransactionBasedOnIdString(null);
    assertNotNull(answer);
    assertNull(answer.getStock());
    assertEquals(org.joda.time.LocalDate.now(), answer.getDate());
    assertNull(answer.getFee());
    assertNull(answer.getPrice());
    assertEquals(((java.lang.Integer) (0)), answer.getNumber());
    assertNotNull(answer.getId());
}