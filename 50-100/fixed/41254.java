@org.junit.Test
public void testPassword() throws java.lang.Exception {
    java.lang.String password = "thepassword";
    when(serverProperties.getPassword()).thenReturn(new org.bff.javampd.server.ServerProperties().getPassword());
    org.bff.javampd.server.MPD mpd = mpdBuilder.password(password).build();
    verify(mpdCommandExecutor).usePassword(commandArgumentCaptor.capture());
    org.junit.Assert.assertNotNull(mpd);
    org.junit.Assert.assertEquals(password, commandArgumentCaptor.getAllValues().get(0));
}