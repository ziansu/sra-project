@org.junit.Test
public void testConstructor() {
    com.moc.chitchat.application.Configuration mockConfiguration = org.mockito.Mockito.mock(com.moc.chitchat.application.Configuration.class);
    com.moc.chitchat.view.authentication.AuthenticationStage mockAuthenticationStage = org.mockito.Mockito.mock(com.moc.chitchat.view.authentication.AuthenticationStage.class);
    com.moc.chitchat.view.main.MainStage mockMainStage = org.mockito.Mockito.mock(com.moc.chitchat.view.main.MainStage.class);
    com.moc.chitchat.application.ApplicationLoader applicationLoader = new com.moc.chitchat.application.ApplicationLoader(mockConfiguration, mockAuthenticationStage, mockMainStage);
    applicationLoader = new com.moc.chitchat.application.ApplicationLoader(mockConfiguration, mockAuthenticationStage, mockMainStage);
    org.junit.Assert.assertNotNull(applicationLoader);
    org.junit.Assert.assertEquals(applicationLoader.getClass(), com.moc.chitchat.application.ApplicationLoader.class);
}