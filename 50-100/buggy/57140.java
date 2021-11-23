@org.junit.Test
public void test_CreateUser() {
    s = Subscriber.SubscriberFactory.createSubsriber("Beathe", "Beispielbraut", TerminalType.PearaPhone4s, new SubscriptionType.GreenMobileS());
    assertEquals("Beathe", s.getForename());
    assertEquals("Beispielbraut", s.getSurname());
    assertEquals("Beathe Beispielbraut", s.getFullName());
    assertEquals(TerminalType.PearaPhone4s, s.getTerminalType());
    assertEquals(new SubscriptionType.GreenMobileS().toString(), s.getSubscriptionType().toString());
}