private void quitParticipants(org.jitsi.meet.test.WebDriver[] participants) {
    for (int i = 0; i < (participants.length); i++) {
        org.jitsi.meet.test.ConferenceFixture.quit(participants[i], false);
    }
}