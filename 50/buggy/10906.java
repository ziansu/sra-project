public void testSendMessageViaElasticEmail() throws java.io.UnsupportedEncodingException {
    email.setSubject("Tests");
    provider = new com.seb.email.routing.EmailServiceProvider(EmailServiceProvider.Providers.ELASTICEMAIL);
    assertEquals(HttpStatus.OK, provider.SendMessageViaElasticEmail(email));
}