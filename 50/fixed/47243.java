public void testSendMessageViaMAILGUN() {
    provider = new com.seb.email.routing.EmailServiceProvider(EmailServiceProvider.Providers.MAILGUN);
    assertEquals(HttpStatus.OK, provider.SendMessageViaMAILGUN(email));
}