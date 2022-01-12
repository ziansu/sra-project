@java.lang.Override
public void propose(final com.kspt.khandygo.core.entities.Meeting meeting) {
    meetingsRepository.add(meeting);
    messageSender.send(meeting.group().id(), messageForMeeting(meeting));
}