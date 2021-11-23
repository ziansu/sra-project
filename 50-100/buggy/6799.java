private void assertActualReportEqualsTo(ru.sbt.refactoring.solidhomework.MailSender fakeMailSender, java.lang.String expectedReportPath) throws java.io.IOException, javax.mail.MessagingException {
    org.mockito.ArgumentCaptor<java.lang.String> messageTextArgumentCaptor = org.mockito.ArgumentCaptor.forClass(java.lang.String.class);
    verify(fakeMailSender).createMessageWithHTMLCode(anyString(), messageTextArgumentCaptor.capture(), anyString());
    java.nio.file.Path path = java.nio.file.Paths.get(expectedReportPath);
    java.lang.String expectedReportContent = new java.lang.String(java.nio.file.Files.readAllBytes(path));
    org.junit.Assert.assertEquals(messageTextArgumentCaptor.getValue(), expectedReportContent);
}