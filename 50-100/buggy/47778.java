@java.lang.Override
public void removeUserFromMeeting(java.lang.Long user_id, java.lang.Long meeting_id) {
    com.example.mm.model.Meeting meeting = meetingRepositoryCrud.findOne(meeting_id);
    com.example.mm.model.User user = userRepositoryCrud.findOne(user_id);
    if ((meeting.users.contains(user)) && (user.meetings.contains(meeting))) {
        meeting.users.remove(user);
        user.meetings.remove(meeting);
        meetingRepositoryCrud.save(meeting);
        userRepositoryCrud.save(user);
        notificationService.deleteNotificationForMeeting(meeting, user.id);
    }
}