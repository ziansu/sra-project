@org.junit.Test
public void shouldBid() {
    java.lang.String p = service.bidAddMoney(1L, 1L, 10);
    org.junit.Assert.assertNotNull(p);
}