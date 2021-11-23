private void quitParticipants(org.jitsi.meet.test.WebDriver[] participants) {
    for (int i = 0; i < ((org.jitsi.meet.test.MaxUsersTests.MAX_USERS) - 2); i++) {
        org.jitsi.meet.test.ConferenceFixture.quit(participants[i], false);
    }
}