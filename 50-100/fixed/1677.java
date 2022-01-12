private void checkLocation(ee.juhan.meetingorganizer.server.core.domain.Meeting meeting) {
    if ((meeting.getLocation()) == null) {
        java.util.List<ee.juhan.meetingorganizer.server.core.domain.Participant> participants = participantRepository.findParticipantsByMeetingId(meeting.getId());
        for (ee.juhan.meetingorganizer.server.core.domain.Participant participant : participants) {
            if ((participant.getParticipationAnswer()) == (ee.juhan.meetingorganizer.server.rest.domain.ParticipationAnswer.NOT_ANSWERED)) {
                return ;
            }
        }
        meeting.setLocation(ee.juhan.meetingorganizer.server.core.util.LocationGeneratorUtil.findOptimalLocation(meeting, participants));
        meetingRepository.save(meeting);
    }
}