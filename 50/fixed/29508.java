@org.junit.Test
public void testGetSessionByUserWhenUserDoesntHaveSession() throws gr.devian.talosquests.backend.Exceptions.TalosQuestsNullArgumentException {
    gr.devian.talosquests.backend.Models.Session session = sessionService.getByUser(testUserWithoutSession);
    assertNull("Failure - Expected null", session);
}