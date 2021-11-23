@org.junit.Test
public void testCheckSessionStateOnValidSession() throws gr.devian.talosquests.backend.Exceptions.TalosQuestsNullArgumentException {
    org.junit.Assert.assertNotNull(sessionService.checkState(testSession));
}