@org.junit.Test
public void testPassword() throws java.lang.Exception {
    java.lang.String password = "thepassword";
    org.mockito.Mockito.when(serverProperties.getPassword()).thenReturn(new org.bff.javampd.server.ServerProperties().getPassword());
    org.bff.javampd.server.MPD mpd = mpdBuilder.password(password).build();
    org.mockito.Mockito.verify(mpdCommandExecutor).usePassword(commandArgumentCaptor.capture());
    org.junit.Assert.assertNotNull(mpd);
    org.junit.Assert.assertEquals(password, commandArgumentCaptor.getAllValues().get(0));
}