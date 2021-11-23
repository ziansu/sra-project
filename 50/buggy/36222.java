@org.junit.Test
public void testGetSessionByUserWhenUserHasSession() throws gr.devian.talosquests.backend.Exceptions.TalosQuestsNullArgumentException {
    gr.devian.talosquests.backend.Models.Session session = sessionService.getByUser(testUserWithSession);
    org.junit.Assert.assertNotNull("Failure - Expected not null", session);
    org.junit.Assert.assertEquals("Failure - Session Ids not Equals", session.getSessionId(), testSession.getSessionId());
}