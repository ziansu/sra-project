@org.junit.Test
public void testDeleteSessionByUserWhenSessionIsValidAndUserIsNotNull() throws gr.devian.talosquests.backend.Exceptions.TalosQuestsNullArgumentException {
    sessionService.delete(testUserWithSession);
    org.junit.Assert.assertNull(sessionService.getByUser(testUserWithSession));
}