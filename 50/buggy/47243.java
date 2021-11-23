public void testSendMessageViaMAILGUN() {
    email.setSubject("Tests");
    provider = new com.seb.email.routing.EmailServiceProvider(EmailServiceProvider.Providers.MAILGUN);
    assertEquals(HttpStatus.OK, provider.SendMessageViaMAILGUN(email));
}